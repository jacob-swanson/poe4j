package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.Constants;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.readers.ValueReaders;
import com.swandiggy.poe4j.util.reflection.Poe4jReflection;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.LazyLoader;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Read a field that references another row by a shared key value.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Slf4j
public class ReferenceFieldReader extends BaseFieldReader<Object> {

    @Setter
    private DatFileReaderFactory datFileReaderFactory;

    @Setter
    private ValueReaders valueReaders;

    public ReferenceFieldReader() {
    }

    public ReferenceFieldReader(DatFileReaderFactory datFileReaderFactory, ValueReaders valueReaders) {
        this.datFileReaderFactory = datFileReaderFactory;
        this.valueReaders = valueReaders;
    }

    @Override
    public boolean supports(Field field) {
        return field.isAnnotationPresent(Reference.class);
    }

    @Override
    protected Object readInternal(DatFileReader reader, Field field) {
        Reference annotation = field.getAnnotation(Reference.class);

        if (field.getType() == List.class) {
            int listSize = reader.getBr().readInt();
            int listOffset = reader.getBr().readInt();
            Class<?> listType = (Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];

            List<Object> listValues = new ArrayList<>(listSize);
            long pos = reader.getBr().getPosition();
            reader.getBr().setPosition(reader.getDataOffset() + listOffset);
            for (int i = 0; i < listSize; i++) {
                listValues.add(readRefValue(reader, listType, annotation));
            }
            reader.getBr().setPosition(pos);

            return listValues;
        } else {
            return readRefValue(reader, field.getType(), annotation);
        }
    }

    private Object readRefValue(DatFileReader reader, Class clazz, Reference annotation) {
        Long index = getIndex(reader, annotation);
        if (index == Constants.MAGIC_NULL) {
            return null;
        }

        return Poe4jReflection.lazyLoad(clazz, (LazyLoader) () -> {
            // Get the referenced .dat file
            try (DatFileReader datFileReader = datFileReaderFactory.create(clazz)) {
                return datFileReader.read(index);
            } catch (IOException e) {
                throw new Poe4jException(e);
            }
        });
    }

    private Long getIndex(DatFileReader reader, Reference annotation) {
        Number value = (Number) valueReaders.read(reader, annotation.value());
        Long index = value.longValue();
        if (index < 0) {
            log.warn("Index was {}", index);
            return Constants.MAGIC_NULL;
        }
        index += annotation.offset();

        return index;
    }

    @Override
    public int size(Field field) {
        if (field.getType() == List.class) {
            return 8;
        }
        Reference annotation = field.getAnnotation(Reference.class);

        return valueReaders.size(annotation.value());
    }

}
