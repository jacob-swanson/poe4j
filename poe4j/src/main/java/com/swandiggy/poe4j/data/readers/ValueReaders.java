package com.swandiggy.poe4j.data.readers;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.data.readers.value.ValueReader;
import com.swandiggy.poe4j.util.io.BinaryReader;
import lombok.Setter;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * Delegates to {@link ValueReader}s. Automagially finds the correct {@link ValueReader} for a class and returns the
 * value.
 *
 * @author Jacob Swanson
 * @since 1/24/2016
 */
public class ValueReaders implements ValueReader {

    @Setter
    private ValueReader[] valueReaders;

    public ValueReaders() {
    }

    public ValueReaders(ValueReader[] valueReaders) {
        this.valueReaders = valueReaders;
    }

    private ValueReader findReader(Class clazz) {
        return Arrays.stream(valueReaders)
                .filter(valueReader -> valueReader.supports(clazz))
                .findFirst()
                .orElseThrow(() -> new Poe4jException(MessageFormat.format("Could not find ValueReader for '{0}'", clazz)));
    }

    @Override
    public Object read(DataFileReader dataFileReader, BinaryReader br, Class clazz) {
        for (ValueReader valueReader : valueReaders) {
            if (valueReader.supports(clazz)) {
                return valueReader.read(dataFileReader, br, clazz);
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find ValueReader for '{0}'", clazz));
    }

    @Override
    public int size(Class clazz) {
        return findReader(clazz).size(clazz);
    }

    @Override
    public boolean supports(Class clazz) {
        return Arrays.stream(valueReaders)
                .filter(valueReader -> valueReader.supports(clazz))
                .findFirst()
                .isPresent();
    }
}
