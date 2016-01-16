package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.DatFileReaderFactory;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.AbstractRow;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.LazyLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.text.MessageFormat;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class ReferenceReader extends BaseFieldReader<Object> {

    @Autowired
    private FieldReader[] fieldReaders;

    @Autowired
    private DatFileReaderFactory datFileReaderFactory;
    
    @Override
    public boolean supports(Field field) {
        return field.isAnnotationPresent(Reference.class);
    }

    /**
     * TODO: Move to a separate class to remove copied code from {@link DatFileReader}
     *
     * @param field
     * @param reader
     * @return
     */
    private Object readField(Field field, DatFileReader reader) {
        for (FieldReader fieldReader : fieldReaders) {
            if (fieldReader.supports(field)) {
                return fieldReader.read(reader, field);
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find FieldReader for '{0}'", field));
    }

    @Override
    protected Object readInternal(DatFileReader reader, Field field) {
        Reference annotation = field.getAnnotation(Reference.class);
        Field referencedKeyField;
        try {
            referencedKeyField = field.getType().getDeclaredField(annotation.value());
        } catch (NoSuchFieldException e) {
            throw new Poe4jException(field.getType().getSimpleName() + "." + annotation.value() + " not found", e);
        }

        Object key = readField(referencedKeyField, reader);

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(field.getType());
        enhancer.setCallback((LazyLoader) () -> {
            try (DatFileReader<AbstractRow> datFileReader = datFileReaderFactory.create(Paths.get(reader.getFile().getParent(), reader.getEntityClasses().inverse().get(field.getType()) + ".dat").toFile())) {
                return datFileReader.read()
                        .filter(row -> {
                            PropertyDescriptor pd = BeanUtils.getPropertyDescriptor(field.getType(), annotation.value());
                            Method getter = pd.getReadMethod();
                            return ReflectionUtils.invokeMethod(getter, row).equals(key);
                        })
                        .findAny()
                        .orElse(null);
            } catch (IOException e) {
                throw new Poe4jException(e);
            }
        });

        return enhancer.create();
    }

    @Override
    public int size(Field field) {
        return 4;
    }
}
