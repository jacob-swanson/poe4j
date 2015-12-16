package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.Constants;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.rows.AbstractRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.LazyLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class RowReader extends BaseValueReader<AbstractRow> {

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;

    @Override
    public boolean supports(Class clazz) {
        return DatFileReader.entityClasses.containsValue(clazz);
    }

    @Override
    protected AbstractRow readInternal(DatFileReader reader, Class clazz) {
        long index = reader.getBr().readLong();
        if (index == Constants.MAGIC_NULL) {
            return null;
        }

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback((LazyLoader) () -> {
            // Get the referenced .dat file
            try (DatFileReader datFileReader = datFileReaderFactory.create(Paths.get(reader.getFile().getParent(), reader.getEntityClasses().inverse().get(clazz) + ".dat").toFile())) {
                return datFileReader.read(index);
            } catch (IOException e) {
                throw new Poe4jException(e);
            }
        });

        return (AbstractRow) enhancer.create();
    }

    @Override
    public int size(Class clazz) {
        return 8;
    }
}
