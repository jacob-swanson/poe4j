package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.data.annotations.Enumerated;
import com.swandiggy.poe4j.util.io.BinaryReader;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Reads an enum field. The enum must implement {@code valueOf(Integer)}.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class EnumFieldReader extends BaseFieldReader<Object> {

    public EnumFieldReader() {
    }

    @Override
    public boolean supports(Field field) {
        return field.isAnnotationPresent(Enumerated.class);
    }

    @Override
    protected Object readInternal(DataFileReader reader, BinaryReader br, Field field) {
        Integer value = br.readInt();

        try {
            Method m = field.getType().getMethod("valueOf", Integer.class);
            return m.invoke(null, value);
        } catch (NoSuchMethodException e) {
            throw new Poe4jException(field.getType().getSimpleName() + ".valueOf(" + Integer.class.getTypeName() + ") not found");
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new Poe4jException("Could not invoke valueOf method for enum", e);
        }
    }

    @Override
    public int size(Field field) {
        return 4;
    }

}
