package com.swandiggy.poe4j.data.readers.value;

import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.data.DatFileReader;
import org.springframework.stereotype.Service;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class ShortReader implements ValueReader<Short> {
    @Override
    public boolean supports(Class clazz) {
        return Primitives.wrap(clazz) == Short.class;
    }

    @Override
    public Short read(DatFileReader reader, Class clazz) {
        return reader.getBr().readShort();
    }

    @Override
    public int size(Class clazz) {
        return 2;
    }
}
