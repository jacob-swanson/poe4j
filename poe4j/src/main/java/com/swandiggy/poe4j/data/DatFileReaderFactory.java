package com.swandiggy.poe4j.data;

import com.swandiggy.poe4j.data.readers.FieldReaders;
import com.swandiggy.poe4j.data.rows.BaseRow;
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
    private FieldReaders fieldReaders;

    @Autowired
    private DatFileLookup datFileLookup;

    public <T extends BaseRow> DatFileReader<T> create(Class<T> clazz) {
        return new DatFileReader<>(clazz, fieldReaders, datFileLookup.getFileForType(clazz));
    }

    public <T extends BaseRow> DatFileReader<T> createUnsafe(Class<?> clazz) {
        return new DatFileReader<>((Class<T>) clazz, fieldReaders, datFileLookup.getFileForType((Class<T>) clazz));
    }

    public <T extends BaseRow> DatFileReader<T> create(File file) {
        return new DatFileReader<>(datFileLookup.getTypeForFile(file), fieldReaders, file);
    }
}
