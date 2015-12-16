package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.annotations.Enumerated;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class EnumReader implements FieldReader<Object> {
    
    @Override
    public boolean supports(Field field) {
        return field.isAnnotationPresent(Enumerated.class);
    }

    @Override
    public Object read(DatFileReader reader, Field field) {
        Integer value = reader.getBr().readInt();

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
