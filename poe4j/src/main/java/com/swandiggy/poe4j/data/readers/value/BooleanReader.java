package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;

/**
 * Read a {@link Boolean} value. Represented by a byte, if the byte is 1, it's true otherwise it's false.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class BooleanReader extends BaseValueReader<Boolean> {

    public BooleanReader() {
    }

    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Boolean.class;
    }

    @Override
    protected Boolean readInternal(DataFileReader reader, BinaryReader br, Class clazz) {
        return br.readByte() == 1;
    }

    @Override
    public int size(Class clazz) {
        return 1;
    }
}
