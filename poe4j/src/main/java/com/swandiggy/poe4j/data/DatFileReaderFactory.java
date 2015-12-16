package com.swandiggy.poe4j.data;

import com.swandiggy.poe4j.data.readers.field.FieldReader;
import com.swandiggy.poe4j.data.rows.AbstractRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
@Service
public class DatFileReaderFactory {

    @Autowired
    private FieldReader[] fieldReaders;

    public DatFileReader<AbstractRow> create(File file) {
        return new DatFileReader<>(file, fieldReaders);
    }

}
