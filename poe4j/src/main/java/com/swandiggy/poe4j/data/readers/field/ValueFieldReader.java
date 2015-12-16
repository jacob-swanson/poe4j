package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.data.readers.value.ValueReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.text.MessageFormat;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class ValueFieldReader extends BaseFieldReader<Object> {

    @Autowired
    private ValueReader[] valueReaders;

    @Override
    public boolean supports(Field field) {
        for (ValueReader reader : valueReaders) {
            if (reader.supports(field.getType())) {
                return true;
            }
        }

        return false;
    }

    @Override
    protected Object readInternal(DatFileReader reader, Field field) {
        for (ValueReader valueReader : valueReaders) {
            if (valueReader.supports(field.getType())) {
                return valueReader.read(reader, field.getType());
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find ValueReader for field '{0}'", field));
    }

    @Override
    public int size(Field field) {
        for (ValueReader valueReader : valueReaders) {
            if (valueReader.supports(field.getType())) {
                return valueReader.size(field.getType());
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find ValueReader for field '{0}'", field));
    }
}
