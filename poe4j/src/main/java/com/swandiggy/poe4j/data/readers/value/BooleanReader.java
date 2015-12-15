package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DatFileReader;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class BooleanReader implements ValueReader<Boolean> {
    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Boolean.class;
    }

    @Override
    public Boolean read(DatFileReader reader, Class clazz) {
        return reader.getBr().readByte() == 1;
    }

    @Override
    public int size(Class clazz) {
        return 1;
    }
}
