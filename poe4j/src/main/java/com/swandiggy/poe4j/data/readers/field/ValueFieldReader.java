package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.data.readers.ValueReaders;
import com.swandiggy.poe4j.data.readers.value.ValueReader;
import com.swandiggy.poe4j.util.io.BinaryReader;
import lombok.Setter;

import java.lang.reflect.Field;

/**
 * Delegates to a {@link ValueReader} to read a value. For simple types such as {@code Integer}.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class ValueFieldReader extends BaseFieldReader<Object> {

    @Setter
    private ValueReaders valueReaders;

    public ValueFieldReader() {
    }

    public ValueFieldReader(ValueReaders valueReaders) {
        this.valueReaders = valueReaders;
    }

    @Override
    public boolean supports(Field field) {
        return valueReaders.supports(field.getType());
    }

    @Override
    protected Object readInternal(DataFileReader reader, BinaryReader br, Field field) {
        return valueReaders.read(reader, br, field.getType());
    }

    @Override
    public int size(Field field) {
        return valueReaders.size(field.getType());
    }

}
