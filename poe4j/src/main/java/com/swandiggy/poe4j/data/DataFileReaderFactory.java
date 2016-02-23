package com.swandiggy.poe4j.data;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.swandiggy.poe4j.data.readers.FieldReaders;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Setter;

import java.io.File;

/**
 * Construct a {@link DataFileReader}. Injects the objects that the {@link DataFileReader} needs to work for you.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class DataFileReaderFactory {

    @Setter
    private FieldReaders fieldReaders;

    @Setter
    private DataFileResolver dataFileResolver;

    /**
     * Weak cache of rows
     */
    private static final Cache<String, DataFileReader> READER_CACHE = CacheBuilder.newBuilder().softValues().build();

    public DataFileReaderFactory() {
    }

    public DataFileReaderFactory(FieldReaders fieldReaders, DataFileResolver dataFileResolver) {
        this.fieldReaders = fieldReaders;
        this.dataFileResolver = dataFileResolver;
    }

    @SuppressWarnings("unchecked")
    private static <T extends BaseRow> DataFileReader<T> cacheGet(Class<T> clazz, File file) {
        String key = clazz.getName() + ":" + file.getAbsolutePath();

        return READER_CACHE.getIfPresent(key);
    }

    private static <T extends BaseRow> void cachePut(DataFileReader<T> reader) {
        String key = reader.getRowClass().getName() + ":" + reader.getFile().getAbsolutePath();

        READER_CACHE.put(key, reader);
    }

    private <T extends BaseRow> DataFileReader<T> getOrCreateReader(Class<T> clazz, File file, long start, long length) {
        DataFileReader<T> reader = cacheGet(clazz, file);
        if (reader == null) {
            reader = new DataFileReader<>(clazz, fieldReaders, file, start, length);
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
    public <T extends BaseRow> DataFileReader<T> create(Class<T> clazz) {
        DataFileResolver.FileDescription fileDescription = dataFileResolver.getFileForType(clazz);
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
    public <T extends BaseRow> DataFileReader<T> createUnsafe(Class<?> clazz) {
        DataFileResolver.FileDescription fileDescription = dataFileResolver.getFileForType((Class<T>) clazz);
        return getOrCreateReader((Class<T>) clazz, fileDescription.getFile(), fileDescription.getStart(), fileDescription.getLength());
    }

    /**
     * Create a reader for a file. Looks up the class automatically.
     *
     * @param file
     * @param <T>
     * @return
     */
    public <T extends BaseRow> DataFileReader<T> create(File file) {
        return getOrCreateReader(DataFileRegistry.getTypeForFile(file), file, 0, file.length());
    }
}
