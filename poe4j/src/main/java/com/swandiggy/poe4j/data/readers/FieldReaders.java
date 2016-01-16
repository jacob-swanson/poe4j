package com.swandiggy.poe4j.data.readers;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.readers.field.FieldReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.Arrays;

/**
 * @author Jacob Swanson
 * @since 1/15/2016
 */
@Service
public class FieldReaders {

    @Autowired
    private FieldReader[] fieldReaders;

    private FieldReader findReader(Field field) {
        return Arrays.stream(fieldReaders)
                .filter(fieldReader1 -> fieldReader1.supports(field))
                .findFirst()
                .orElseThrow(() -> new Poe4jException(MessageFormat.format("Could not find FieldReader for '{0}'", field)));
    }

    public Object read(Field field, DatFileReader datFileReader) {
        for (FieldReader fieldReader : fieldReaders) {
            if (fieldReader.supports(field)) {
                return fieldReader.read(datFileReader, field);
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find FieldReader for '{0}'", field));
    }

    public Integer size(Field field) {
        return findReader(field).size(field);
    }

    public boolean supports(Field field) {
        return Arrays.stream(fieldReaders)
                .filter(fieldReader1 -> fieldReader1.supports(field))
                .findFirst()
                .isPresent();
    }
}
