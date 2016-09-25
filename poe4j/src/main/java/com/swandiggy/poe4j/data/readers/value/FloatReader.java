package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;

/**
 * Read an int value.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class FloatReader extends BaseValueReader<Float> {

    public FloatReader() {
    }

    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Float.class;
    }

    @Override
    protected Float readInternal(DataFileReader reader, BinaryReader br, Class clazz) {
        return br.readFloat();
    }

    @Override
    public int size(Class clazz) {
        return 4;
    }
}
