package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;
import lombok.extern.slf4j.Slf4j;

/**
 * Read a string value. Reads an int pointer into the variable width portion of the file. Strings are null terminated
 * and encoded as UTF-16LE.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Slf4j
public class StringReader extends BaseValueReader<String> {

    public StringReader() {
    }

    @Override
    public boolean supports(Class clazz) {
        return clazz == String.class;
    }

    @Override
    protected String readInternal(DataFileReader reader, BinaryReader br, Class clazz) {
        int ref = br.readInt();

        long oldPos = br.getPosition();
        long stringPos = reader.getDataOffset() + ref;
        if (stringPos < 0 || stringPos >= br.length()) {
            log.warn("String was out of bounds eof: '{}', string ref: '{}'", br.length(), stringPos);
            return null;
        }
        br.setPosition(reader.getDataOffset() + ref);
        String s = br.readString("UTF-16LE");
        br.setPosition(oldPos);

        return s;
    }

    @Override
    public int size(Class clazz) {
        return 4;
    }
}
