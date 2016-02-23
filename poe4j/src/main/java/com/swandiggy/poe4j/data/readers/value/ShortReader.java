package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;

/**
 * Read a short value.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class ShortReader extends BaseValueReader<Short> {

    public ShortReader() {
    }

    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Short.class;
    }

    @Override
    protected Short readInternal(DataFileReader reader, BinaryReader br, Class clazz) {
        return br.readShort();
    }

    @Override
    public int size(Class clazz) {
        return 2;
    }
}
