package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DatFileReader;
import org.springframework.stereotype.Service;

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
    protected Byte readInternal(DatFileReader reader, Class clazz) {
        return reader.getBr().readByte();
    }

    @Override
    public int size(Class clazz) {
        return 1;
    }
}
