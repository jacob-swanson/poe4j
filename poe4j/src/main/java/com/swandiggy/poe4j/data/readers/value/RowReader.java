package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.Constants;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.rows.AbstractRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class RowReader implements ValueReader<AbstractRow> {

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;

    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Byte.class;
    }

    @Override
    public AbstractRow read(DatFileReader reader, Class clazz) {
        long index = reader.getBr().readLong();
        if (index == Constants.MAGIC_NULL) {
            return null;
        }

        // Get the referenced .dat file
        try (DatFileReader datFileReader = datFileReaderFactory.create(Paths.get(reader.getFile().getParent(), reader.getEntityClasses().inverse().get(clazz) + ".dat").toFile())) {
            return datFileReader.read(index);
        } catch (IOException e) {
            throw new Poe4jException(e);
        }
    }

    @Override
    public int size(Class clazz) {
        return 8;
    }
}
