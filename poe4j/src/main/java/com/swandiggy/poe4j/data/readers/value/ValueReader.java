package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.data.DatFileReader;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public interface ValueReader<T> {

    boolean supports(Class clazz);

    T read(DatFileReader reader, Class clazz);
    
    int size(Class clazz);

}
