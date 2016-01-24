package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DatFileReader;
import org.springframework.stereotype.Service;

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
    protected Boolean readInternal(DatFileReader reader, Class clazz) {
        return reader.getBr().readByte() == 1;
    }

    @Override
    public int size(Class clazz) {
        return 1;
    }
}
