package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;

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
    protected Long readInternal(DataFileReader reader, BinaryReader br, Class clazz) {
        return br.readLong();
    }

    @Override
    public int size(Class clazz) {
        return 8;
    }
}
