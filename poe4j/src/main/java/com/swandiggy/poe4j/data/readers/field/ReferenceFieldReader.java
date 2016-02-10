package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.Constants;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.readers.ValueReaders;
import com.swandiggy.poe4j.util.reflection.Poe4jReflection;
import lombok.Setter;
import org.springframework.cglib.proxy.LazyLoader;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Read a field that references another row by a shared key value.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
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
        return field.isAnnotationPresent(ReferenceOne.class);
    }

    @Override
    protected Object readInternal(DatFileReader reader, Field field) {
        Reference annotation = field.getAnnotation(Reference.class);
        Long index = getIndex(reader, annotation);
        if (index == Constants.MAGIC_NULL) {
            return null;
        }

        return Poe4jReflection.lazyLoad(field.getType(), (LazyLoader) () -> {
            // Get the referenced .dat file
            Class clazz = field.getType();
            try (DatFileReader datFileReader = datFileReaderFactory.create(clazz)) {
                return datFileReader.read(index);
            } catch (IOException e) {
                throw new Poe4jException(e);
            }
        });
    }

    private Long getIndex(DatFileReader reader, Reference annotation) {
        long index = (Long) valueReaders.read(reader, annotation.value());
        index += annotation.offset();

        return index;
    }

    @Override
    public int size(Field field) {
        Reference annotation = field.getAnnotation(Reference.class);

        return valueReaders.size(annotation.value());
    }

}
