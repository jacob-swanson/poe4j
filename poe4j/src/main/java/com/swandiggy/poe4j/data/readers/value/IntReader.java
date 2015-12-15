package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DatFileReader;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class IntReader implements ValueReader<Integer> {
    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Integer.class;
    }

    @Override
    public Integer read(DatFileReader reader, Class clazz) {
        return reader.getBr().readInt();
    }

    @Override
    public int size(Class clazz) {
        return 4;
    }
}
