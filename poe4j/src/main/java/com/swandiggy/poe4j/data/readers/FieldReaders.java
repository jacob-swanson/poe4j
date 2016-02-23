package com.swandiggy.poe4j.data.readers;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.data.readers.field.FieldReader;
import com.swandiggy.poe4j.util.io.BinaryReader;
import lombok.Setter;

import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.Arrays;

/**
 * Delegates to {@link FieldReader}s. Automagially finds the correct {@link FieldReader} for a field and returns the
 * value.
 *
 * @author Jacob Swanson
 * @since 1/15/2016
 */
public class FieldReaders implements FieldReader<Object> {

    @Setter
    private FieldReader[] fieldReaders;

    public FieldReaders() {
    }

    public FieldReaders(FieldReader[] fieldReaders) {
        this.fieldReaders = fieldReaders;
    }

    private FieldReader findReader(Field field) {
        return Arrays.stream(fieldReaders)
                .filter(fieldReader1 -> fieldReader1.supports(field))
                .findFirst()
                .orElseThrow(() -> new Poe4jException(MessageFormat.format("Could not find FieldReader for '{0}'", field)));
    }

    @Override
    public Object read(DataFileReader dataFileReader, BinaryReader br, Field field) {
        for (FieldReader fieldReader : fieldReaders) {
            if (fieldReader.supports(field)) {
                return fieldReader.read(dataFileReader, br, field);
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find FieldReader for '{0}'", field));
    }

    @Override
    public int size(Field field) {
        return findReader(field).size(field);
    }

    @Override
    public boolean supports(Field field) {
        return Arrays.stream(fieldReaders)
                .filter(fieldReader1 -> fieldReader1.supports(field))
                .findFirst()
                .isPresent();
    }
}
