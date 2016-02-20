package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;

/**
 * Read a byte value.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class ByteReader extends BaseValueReader<Byte> {

    public ByteReader() {
    }

    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Byte.class;
    }

    @Override
    protected Byte readInternal(DatFileReader reader, BinaryReader br, Class clazz) {
        return br.readByte();
    }

    @Override
    public int size(Class clazz) {
        return 1;
    }
}
