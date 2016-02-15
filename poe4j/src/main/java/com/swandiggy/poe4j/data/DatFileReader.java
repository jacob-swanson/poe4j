package com.swandiggy.poe4j.data;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.readers.FieldReaders;
import com.swandiggy.poe4j.data.readers.field.FieldReader;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.util.io.BinaryReader;
import com.swandiggy.poe4j.util.io.MappedBinaryReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.util.Assert;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Read rows from a .dat file.
 *
 * @author Jacob Swanson
 * @since 9/5/2015
 */
@Slf4j
public class DatFileReader<T extends BaseRow> implements Closeable {

    /**
     * Weak cache of records
     */
    private static final Cache<String, BaseRow> recordCache = CacheBuilder.newBuilder().softValues().build();

    private BinaryReader br; // reader for the file
    private long dataOffset; // Offset to the beginning of the variable width portion
    private int entitySize; // Size of a rows in the fixed width portion
    private List<Field> fields; // List of fields in the rows, sorted by @Order
    private Class<?> recordType; // Class to map records to
    private int count; // Number of records in the fixed width portion
    private FieldReaders fieldReaders;

    /**
     * Create a new .dat file reader.
     */
    public DatFileReader(Class<T> clazz, FieldReaders fieldReaders, File file) {
        this(clazz, fieldReaders, file, 0, file.length());
    }

    public DatFileReader(Class<T> clazz, FieldReaders fieldReaders, File file, long start, long length) {
        this(clazz, fieldReaders, new MappedBinaryReader(file, "r", start, length));
    }

    public DatFileReader(Class<T> clazz, FieldReaders fieldReaders, BinaryReader br) {
        this.fieldReaders = fieldReaders;
        this.recordType = clazz;
        this.br = br;

        Assert.notNull(recordType, "Could not find rows class for '" + br.getFile().getName() + "'");

        // Get fields with @Order and sort them
        Comparator<Field> byOrder = (o1, o2) -> Integer.compare(o1.getAnnotation(Order.class).value(), o2.getAnnotation(Order.class).value());
        fields = Arrays.stream(recordType.getDeclaredFields())
                .filter(field -> field.getAnnotation(Order.class) != null)
                .sorted(byOrder)
                .collect(Collectors.toList());

        // Read basic stuff from the rows
        count = br.readInt();

        entitySize = getEntitySize();
        dataOffset = 4 + entitySize * count;

        // Check that the rows size is correct
        br.setPosition(dataOffset);
        long magic = br.readLong();
        if (magic != Constants.MAGIC_DATA_SEPARATOR) {
            throw new Poe4jException(MessageFormat.format("Row size incorrect for {0} expected {1} bytes, was {2} bytes", recordType.getCanonicalName(), entitySize, calcActualRowSize()));
        }
        br.setPosition(4);
    }

    /**
     * Find the data separator and return the row size.
     *
     * TODO: Use a search algorithm
     *
     * @return data separator offset / row count
     */
    private int calcActualRowSize() {
        for (int i = 0; i < br.length(); i++) {
            br.setPosition(i);
            if (br.readLong() == Constants.MAGIC_DATA_SEPARATOR) {
                log.debug("Found magic separator at {} bytes", i);

                return i/count;
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find data separator in {0}", br.getFile().getAbsolutePath()));
    }

    @Override
    public void close() throws IOException {
        if (br != null) {
            br.close();
        }
    }

    private T cacheGet(long index) {
        String key = index + ":" + recordType.getCanonicalName();
        if (recordCache.getIfPresent(key) != null) {
            return (T) recordCache.getIfPresent(key);
        }

        return null;
    }

    private void cachePut(T record) {
        String key = record.getIndex() + ":" + recordType.getCanonicalName();
        recordCache.put(key, record);
    }

    private void checkBounds(long index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
    }

    /**
     * Read a specific rows from the file by index.
     *
     * @param index Index of the rows, starts at 0.
     * @return The specified rows
     */
    public T read(long index) {
        checkBounds(index);

        if (cacheGet(index) != null) {
            return cacheGet(index);
        }

        log.info("Reading '" + index + "' from '" + br.getFile().getName() + "'");

        long recordOffset = index * entitySize + 4; // Index + size of rows + header
        if (br.getPosition() != recordOffset) {
            br.setPosition(recordOffset);
        }

        Map<String, Object> values = new HashMap<>(fields.size() + 1);
        values.put("index", index);
        values.put("offset", recordOffset);

        for (Field field : fields) {
            values.put(field.getName(), fieldReaders.read(this, field));
        }

        BeanWrapper wrapper = new BeanWrapperImpl(recordType);
        wrapper.setPropertyValues(values);
        T value = (T) wrapper.getWrappedInstance();

        cachePut(value);

        return value;
    }

    public Stream<T> read() {
        return IntStream.range(0, count)
                .mapToObj(this::read);
    }

    /**
     * Calculate the size of a row.
     *
     * @return Calculated size of entity in bytes
     */
    private int getEntitySize() {
        int size = 0;

        for (Field field : recordType.getDeclaredFields()) {
            size += fieldReaders.size(field);
        }

        return size;
    }

    public BinaryReader getBr() {
        return br;
    }

    public long getDataOffset() {
        return dataOffset;
    }

    public File getFile() {
        return br.getFile();
    }

    public Class<?> getRecordType() {
        return recordType;
    }

    public void setRecordType(Class<?> recordType) {
        this.recordType = recordType;
    }
}
