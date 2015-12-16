package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.readers.value.ValueReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class ListReader extends BaseFieldReader<List> {

    @Autowired
    private ValueReader[] valueReaders;

    @Override
    public boolean supports(Field field) {
        return field.getType() == List.class;
    }

    @Override
    protected List readInternal(DatFileReader reader, Field field) {
        int listSize = reader.getBr().readInt();
        int listOffset = reader.getBr().readInt();

        Class<?> listType = (Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];

        List<Object> listValues = new ArrayList<>(listSize);
        long pos = reader.getBr().getPosition();
        reader.getBr().setPosition(reader.getDataOffset() + listOffset);
        for (int i = 0; i < listSize; i++) {
            listValues.add(readValue(reader, listType));
        }
        reader.getBr().setPosition(pos);

        return listValues;
    }

    private Object readValue(DatFileReader reader, Class clazz) {
        for (ValueReader valueReader : valueReaders) {
            if (valueReader.supports(clazz)) {
                return valueReader.read(reader, clazz);
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find ValueReader for class '{0}'", clazz));
    }

    @Override
    public int size(Field field) {
        return 8;
    }
}
