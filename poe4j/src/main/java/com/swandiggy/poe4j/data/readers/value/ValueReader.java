package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;

/**
 * Read a value from a row class.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public interface ValueReader<T> {

    boolean supports(Class clazz);

    T read(DatFileReader datFileReader, BinaryReader br, Class clazz);
    
    int size(Class clazz);

}
