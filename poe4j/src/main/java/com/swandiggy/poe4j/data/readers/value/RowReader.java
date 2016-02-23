package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.data.*;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.util.io.BinaryReader;
import com.swandiggy.poe4j.util.reflection.Poe4jReflection;
import lombok.Setter;
import org.springframework.cglib.proxy.LazyLoader;

/**
 * Reads a reference to another row class. References are lazy loaded.
 * <p>
 * References are the index of the referenced row and are stored as a long. If the value is
 * {@link Constants#MAGIC_NULL}, then the reference is {@code null}.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class RowReader extends BaseValueReader<BaseRow> {

    @Setter
    private DataFileReaderFactory dataFileReaderFactory;

    public RowReader() {
    }

    public RowReader(DataFileReaderFactory dataFileReaderFactory) {
        this.dataFileReaderFactory = dataFileReaderFactory;
    }

    @Override
    public boolean supports(Class clazz) {
        return DataFileRegistry.isRegistered(clazz);
    }

    @Override
    protected BaseRow readInternal(DataFileReader reader, BinaryReader br, Class clazz) {
        long index = br.readLong();
        if (index == Constants.MAGIC_NULL) {
            return null;
        }

        return (BaseRow) Poe4jReflection.lazyLoad(clazz, (LazyLoader) () -> {
            // Get the referenced .dat file
            DataFileReader dataFileReader = dataFileReaderFactory.create(clazz);
            return dataFileReader.read(index);
        });
    }

    @Override
    public int size(Class clazz) {
        return 8;
    }
}
