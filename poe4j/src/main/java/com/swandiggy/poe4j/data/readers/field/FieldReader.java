package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.data.DatFileReader;

import java.lang.reflect.Field;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public interface FieldReader<T> {

    boolean supports(Field field);

    T read(DatFileReader reader, Field field);

    int size(Field field);

}
