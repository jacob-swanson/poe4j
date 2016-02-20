package com.swandiggy.poe4j.data;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.sun.org.apache.regexp.internal.RE;
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

    /**
     * Weak cache of rows
     */
    private static final Cache<String, DatFileReader> READER_CACHE = CacheBuilder.newBuilder().softValues().build();

    public DatFileReaderFactory() {
    }

    public DatFileReaderFactory(FieldReaders fieldReaders, DatFileLookup datFileLookup) {
        this.fieldReaders = fieldReaders;
        this.datFileLookup = datFileLookup;
    }

    @SuppressWarnings("unchecked")
    private static <T extends BaseRow> DatFileReader<T> cacheGet(Class<T> clazz, File file) {
        String key = clazz.getName() + ":" + file.getAbsolutePath();

        return READER_CACHE.getIfPresent(key);
    }

    private static <T extends BaseRow> void cachePut(DatFileReader<T> reader) {
        String key = reader.getRowClass().getName() + ":" + reader.getFile().getAbsolutePath();

        READER_CACHE.put(key, reader);
    }

    private <T extends BaseRow> DatFileReader<T> getOrCreateReader(Class<T> clazz, File file, long start, long length) {
        DatFileReader<T> reader = cacheGet(clazz, file);
        if (reader == null) {
            reader = new DatFileReader<>(clazz, fieldReaders, file, start, length);
            cachePut(reader);
        }

        return reader;
    }

    /**
     * Create a reader for a class. Looks up the file automatically.
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T extends BaseRow> DatFileReader<T> create(Class<T> clazz) {
        DatFileLookup.FileDescription fileDescription = datFileLookup.getFileForType(clazz);
        return getOrCreateReader(clazz, fileDescription.getFile(), fileDescription.getStart(), fileDescription.getLength());
    }

    /**
     * Create a reader for a class. Looks up the file automatically. Does all of the ugly casting for you.
     *
     * @param clazz
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T extends BaseRow> DatFileReader<T> createUnsafe(Class<?> clazz) {
        DatFileLookup.FileDescription fileDescription = datFileLookup.getFileForType((Class<T>) clazz);
        return getOrCreateReader((Class<T>) clazz, fileDescription.getFile(), fileDescription.getStart(), fileDescription.getLength());
    }

    /**
     * Create a reader for a file. Looks up the class automatically.
     *
     * @param file
     * @param <T>
     * @return
     */
    public <T extends BaseRow> DatFileReader<T> create(File file) {
        return getOrCreateReader(datFileLookup.getTypeForFile(file), file, 0, file.length());
    }
}
