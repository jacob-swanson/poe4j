package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.Constants;
import com.swandiggy.poe4j.data.DatFileLookup;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.util.reflection.Poe4jReflection;
import lombok.Setter;
import org.springframework.cglib.proxy.LazyLoader;

import java.io.IOException;

/**
 * Reads a reference to another row class. References are lazy loaded.
 *
 * References are the index of the referenced row and are stored as a long. If the value is
 * {@link Constants#MAGIC_NULL}, then the reference is {@code null}.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class RowReader extends BaseValueReader<BaseRow> {

    @Setter
    private DatFileReaderFactory datFileReaderFactory;

    public RowReader() {
    }

    public RowReader(DatFileReaderFactory datFileReaderFactory) {
        this.datFileReaderFactory = datFileReaderFactory;
    }

    @Override
    public boolean supports(Class clazz) {
        return DatFileLookup.rowClasses.containsValue(clazz);
    }

    @Override
    protected BaseRow readInternal(DatFileReader reader, Class clazz) {
        long index = reader.getBr().readLong();
        if (index == Constants.MAGIC_NULL) {
            return null;
        }

        return (BaseRow) Poe4jReflection.lazyLoad(clazz, (LazyLoader) () -> {
            // Get the referenced .dat file
            try (DatFileReader datFileReader = datFileReaderFactory.create(clazz)) {
                return datFileReader.read(index);
            } catch (IOException e) {
                throw new Poe4jException(e);
            }
        });
    }

    @Override
    public int size(Class clazz) {
        return 8;
    }
}
