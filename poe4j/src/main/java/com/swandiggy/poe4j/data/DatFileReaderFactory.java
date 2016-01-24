package com.swandiggy.poe4j.data;

import com.swandiggy.poe4j.data.readers.FieldReaders;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Construct a {@link DatFileReader}. Injects the objects that the {@link DatFileReader} needs to work for you.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class DatFileReaderFactory {

    @Setter
    private FieldReaders fieldReaders;

    @Setter
    private DatFileLookup datFileLookup;

    public DatFileReaderFactory() {
    }

    public DatFileReaderFactory(FieldReaders fieldReaders, DatFileLookup datFileLookup) {
        this.fieldReaders = fieldReaders;
        this.datFileLookup = datFileLookup;
    }

    /**
     * Create a reader for a class. Looks up the file automatically.
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends BaseRow> DatFileReader<T> create(Class<T> clazz) {
        return new DatFileReader<>(clazz, fieldReaders, datFileLookup.getFileForType(clazz));
    }

    /**
     * Create a reader for a class. Looks up the file automatically. Does all of the ugly casting for you.
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends BaseRow> DatFileReader<T> createUnsafe(Class<?> clazz) {
        return new DatFileReader<>((Class<T>) clazz, fieldReaders, datFileLookup.getFileForType((Class<T>) clazz));
    }

    /**
     * Create a reader for a file. Looks up the class automatically.
     *
     * @param file
     * @param <T>
     * @return
     */
    public <T extends BaseRow> DatFileReader<T> create(File file) {
        return new DatFileReader<>(datFileLookup.getTypeForFile(file), fieldReaders, file);
    }
}
