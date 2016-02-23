package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.data.DataFileReader;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.readers.ValueReaders;
import com.swandiggy.poe4j.util.io.BinaryReader;
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
    protected List readInternal(DataFileReader reader, BinaryReader br, Field field) {
        int listSize = br.readInt();
        int listOffset = br.readInt();

        Class<?> listType = (Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];

        List<Object> listValues = new ArrayList<>(listSize);
        long pos = br.getPosition();
        br.setPosition(reader.getDataOffset() + listOffset);
        for (int i = 0; i < listSize; i++) {
            listValues.add(readValue(reader, br, listType));
        }
        br.setPosition(pos);

        return listValues;
    }

    private Object readValue(DataFileReader reader, BinaryReader br, Class clazz) {
        return valueReaders.read(reader, br, clazz);
    }

    @Override
    public int size(Field field) {
        return 8;
    }

}
