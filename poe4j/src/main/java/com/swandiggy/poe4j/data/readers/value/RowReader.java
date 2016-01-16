package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.Constants;
import com.swandiggy.poe4j.data.DatFileLookup;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.util.reflection.Poe4jReflection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.LazyLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class RowReader extends BaseValueReader<BaseRow> {

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;

    @Override
    public boolean supports(Class clazz) {
        return DatFileLookup.entityClasses.containsValue(clazz);
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
