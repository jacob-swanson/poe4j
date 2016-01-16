package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.readers.FieldReaders;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.util.reflection.Poe4jReflection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.LazyLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class ReferenceReader extends BaseFieldReader<Object> {

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;

    @Autowired
    private FieldReaders fieldReaders;
    
    @Override
    public boolean supports(Field field) {
        return field.isAnnotationPresent(ReferenceOne.class);
    }

    @Override
    protected Object readInternal(DatFileReader reader, Field field) {
        ReferenceOne annotation = field.getAnnotation(ReferenceOne.class);
        Field referencedKeyField = Poe4jReflection.getField(field.getType(), annotation.value());

        Object key = fieldReaders.read(referencedKeyField, reader);

        return Poe4jReflection.lazyLoad(field.getType(),(LazyLoader) () -> {
            // TODO: Ugly .dat file resolution
            try (DatFileReader<BaseRow> datFileReader = datFileReaderFactory.createUnsafe(field.getType())) {
                BaseRow referencedRow = datFileReader.read()
                        .filter(row -> Poe4jReflection.readProperty(row, annotation.value()).equals(key))
                        .findAny()
                        .orElse(null);

                if (annotation.required() && referencedRow == null) {
                    throw new Poe4jException("Row was required and not found");
                }

                return referencedRow;
            } catch (IOException e) {
                throw new Poe4jException(e);
            }
        });
    }

    @Override
    public int size(Field field) {
        ReferenceOne annotation = field.getAnnotation(ReferenceOne.class);
        Field referencedKeyField = Poe4jReflection.getField(field.getType(), annotation.value());

        return fieldReaders.size(referencedKeyField);
    }
}
