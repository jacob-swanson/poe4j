package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.data.DatFileReader;
import org.springframework.stereotype.Service;

/**
 * Read a string value. Reads an int pointer into the variable width portion of the file. Strings are null terminated
 * and encoded as UTF-16LE.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class StringReader extends BaseValueReader<String> {

    public StringReader() {
    }

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
