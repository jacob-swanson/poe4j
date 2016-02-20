package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;

/**
 * Read an int value.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class IntReader extends BaseValueReader<Integer> {

    public IntReader() {
    }

    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Integer.class;
    }

    @Override
    protected Integer readInternal(DatFileReader reader, BinaryReader br, Class clazz) {
        return br.readInt();
    }

    @Override
    public int size(Class clazz) {
        return 4;
    }
}
