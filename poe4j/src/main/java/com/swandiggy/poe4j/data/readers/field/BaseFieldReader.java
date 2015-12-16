package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.data.DatFileReader;
import org.springframework.util.Assert;

import java.lang.reflect.Field;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public abstract class BaseFieldReader<T> implements FieldReader<T> {

    @Override
    public T read(DatFileReader reader, Field field) {
        long startPos = reader.getBr().getPosition();

        T value = readInternal(reader, field);

        long endPos = reader.getBr().getPosition();

        Assert.isTrue(endPos == startPos + size(field), "number of bytes read incorrect");

        return value;
    }

    protected abstract T readInternal(DatFileReader reader, Field field);
}
