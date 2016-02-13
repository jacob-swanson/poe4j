package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.readers.ValueReaders;
import lombok.Setter;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads a {@link List>} field.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class ListFieldReader extends BaseFieldReader<List> {

    @Setter
    private ValueReaders valueReaders;

    public ListFieldReader() {
    }

    public ListFieldReader(ValueReaders valueReaders) {
        this.valueReaders = valueReaders;
    }

    @Override
    public boolean supports(Field field) {
        return field.getType() == List.class &&
                !field.isAnnotationPresent(Reference.class);
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
        return valueReaders.read(reader, clazz);
    }

    @Override
    public int size(Field field) {
        return 8;
    }

}
