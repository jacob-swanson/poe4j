package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DatFileReader;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class LongReader implements ValueReader<Long> {
    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Long.class;
    }

    @Override
    public Long read(DatFileReader reader, Class clazz) {
        return reader.getBr().readLong();
    }

    @Override
    public int size(Class clazz) {
        return 8;
    }
}
