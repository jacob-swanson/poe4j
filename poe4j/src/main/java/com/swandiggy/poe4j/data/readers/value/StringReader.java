package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.data.DatFileReader;
import org.springframework.stereotype.Service;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class StringReader extends BaseValueReader<String> {
    @Override
    public boolean supports(Class clazz) {
        return clazz == String.class;
    }

    @Override
    protected String readInternal(DatFileReader reader, Class clazz) {
        int ref = reader.getBr().readInt();

        long oldPos = reader.getBr().getPosition();
        reader.getBr().setPosition(reader.getDataOffset() + ref);
        String s = reader.getBr().readString("UTF-16LE");
        reader.getBr().setPosition(oldPos);

        return s;
    }

    @Override
    public int size(Class clazz) {
        return 4;
    }
}
