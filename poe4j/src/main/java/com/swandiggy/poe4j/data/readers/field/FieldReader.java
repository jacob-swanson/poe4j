package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;

import java.lang.reflect.Field;

/**
 * Read a field from a row class.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public interface FieldReader<T> {

    boolean supports(Field field);

    T read(DatFileReader datFileReader, BinaryReader br, Field field);

    int size(Field field);

}
