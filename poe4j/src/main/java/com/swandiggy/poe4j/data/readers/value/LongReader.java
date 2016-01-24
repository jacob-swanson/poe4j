package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DatFileReader;
import org.springframework.stereotype.Service;

/**
 * Read a long value.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class LongReader extends BaseValueReader<Long> {

    public LongReader() {
    }

    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Long.class;
    }

    @Override
    protected Long readInternal(DatFileReader reader, Class clazz) {
        return reader.getBr().readLong();
    }

    @Override
    public int size(Class clazz) {
        return 8;
    }
}
