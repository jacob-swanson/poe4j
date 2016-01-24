package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.data.DatFileReader;
import org.springframework.util.Assert;

/**
 * Ensures that a {@link ValueReader} reads the correct number of bytes.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public abstract class BaseValueReader<T> implements ValueReader<T> {
    @Override
    public T read(DatFileReader reader, Class clazz) {
        long startPos = reader.getBr().getPosition();

        T value = readInternal(reader, clazz);

        long endPos = reader.getBr().getPosition();

        Assert.isTrue(endPos == startPos + size(clazz), "number of bytes read incorrect");

        return value;
    }

    protected abstract T readInternal(DatFileReader reader, Class clazz);
}
