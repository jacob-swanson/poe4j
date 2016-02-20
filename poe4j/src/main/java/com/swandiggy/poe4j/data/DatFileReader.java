package com.swandiggy.poe4j.data;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.readers.FieldReaders;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.util.io.BinaryReader;
import com.swandiggy.poe4j.util.io.MappedBinaryReader;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
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
public class DatFileReader<T extends BaseRow> {

    /**
     * Weak cache of rows
     */
    private static final Cache<String, BaseRow> ROW_CACHE = CacheBuilder.newBuilder().softValues().build();

    private static final Comparator<Field> BY_ORDER = (o1, o2) -> Integer.compare(o1.getAnnotation(Order.class).value(), o2.getAnnotation(Order.class).value());

    /**
     * Offset to the beginning of the variable width portion
     */
    @Getter
    private long dataOffset;

    /**
     * Size of a rows in the fixed width portion
     */
    @Getter
    private int entitySize;

    /**
     * Number of rows in the fixed width portion
     */
    @Getter
    private int count;

    private List<Field> fields; // List of fields in the rows, sorted by @Order

    /**
     * Class to map records to
     */
    @Getter
    private Class<T> rowClass;

    private FieldReaders fieldReaders;

    @Getter
    private File file;

    private long start;
    private long length;

    /**
     * Create a reader for a .dat file.
     */
    public DatFileReader(Class<T> rowClass, FieldReaders fieldReaders, File file) {
        this(rowClass, fieldReaders, file, 0, file.length());
    }

    /**
     * Create a reader for a .dat file in Content.ggpk.
     *
     * @param rowClass     Class to read rows into
     * @param fieldReaders Instance of {@link FieldReaders}
     * @param file         File to open
     * @param start        Start offset of file record
     * @param length       Length of the file record
     */
    public DatFileReader(Class<T> rowClass, FieldReaders fieldReaders, File file, long start, long length) {
        this.fieldReaders = fieldReaders;
        this.rowClass = rowClass;
        this.file = file;
        this.start = start;
        this.length = length;

        log.debug("Creating DatFileReader for {}", rowClass.getSimpleName());

        try (BinaryReader br = createBinaryReader()) {
            // Get fields with @Order and sort them
            fields = Arrays.stream(this.rowClass.getDeclaredFields())
                    .filter(field -> field.getAnnotation(Order.class) != null)
                    .sorted(BY_ORDER)
                    .collect(Collectors.toList());

            // Read basic stuff from the rows
            count = br.readInt();
            entitySize = calcEntitySize();
            dataOffset = 4 + entitySize * count;

            // Check that the rows size is correct
            br.setPosition(dataOffset);
            long magic = br.readLong();
            if (magic != Constants.MAGIC_DATA_SEPARATOR) {
                throw new Poe4jException(MessageFormat.format("Row size incorrect for {0} row class size {1} bytes, size in file was {2} bytes", this.rowClass.getCanonicalName(), entitySize, calcActualRowSize(br)));
            }
        } catch (IOException e) {
            throw new Poe4jException("Could not close BinaryReader", e);
        }
    }

    /**
     * Read a specific row from the file by index.
     *
     * @param index index of the row, starts at 0.
     * @return the specified row
     */
    public T read(long index) {
        checkBounds(index);

        try (BinaryReader br = createBinaryReader()) {
            return read(index, br);
        } catch (IOException e) {
            throw new Poe4jException("Could not close BinaryReader");
        }
    }

    /**
     * Stream values from a .dat file.
     *
     * @return stream of rowClass objects.
     */
    public Stream<T> read() {
        try (BinaryReader br = createBinaryReader()) {
            return IntStream.range(0, count)
                    .mapToObj(i -> read(i, br));
        } catch (IOException e) {
            throw new Poe4jException("Could not close BinaryReader");
        }
    }

    /**
     * Find the data separator and return the row size.
     *
     * TODO: Use search algorithm
     *
     * @return data separator offset / row count
     */
    private int calcActualRowSize(BinaryReader br) {
        for (int i = 0; i < br.length(); i++) {
            br.setPosition(i);
            if (br.readLong() == Constants.MAGIC_DATA_SEPARATOR) {
                log.debug("Found magic separator at {} bytes", i);

                return i / count;
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find data separator in {0}", br.getFile().getAbsolutePath()));
    }

    @SuppressWarnings("unchecked")
    private T cacheGet(long index) {
        String key = index + ":" + rowClass.getCanonicalName();
        if (ROW_CACHE.getIfPresent(key) != null) {
            return (T) ROW_CACHE.getIfPresent(key);
        }

        return null;
    }

    private void cachePut(T record) {
        String key = record.getIndex() + ":" + rowClass.getCanonicalName();
        ROW_CACHE.put(key, record);
    }

    /**
     * Check for bounds on index.
     *
     * @param index index to check
     */
    private void checkBounds(long index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
    }

    /**
     * Create a new {@link BinaryReader} for the configured file.
     *
     * @return created {@link BinaryReader}.
     */
    private BinaryReader createBinaryReader() {
        return new MappedBinaryReader(file, "r", start, length);
    }

    /**
     * Read a row given its index and a {@link BinaryReader}.
     *
     * @param index index
     * @param br    BinaryReader
     * @return read or cached row
     */
    @SuppressWarnings("unchecked")
    private T read(long index, BinaryReader br) {
        checkBounds(index);

        if (cacheGet(index) != null) {
            return cacheGet(index);
        }

        log.info("Reading {} of type {} from {}", index, rowClass.getSimpleName(), file.getName());

        long recordOffset = index * entitySize + 4; // Index + size of rows + header
        br.setPosition(recordOffset);

        Map<String, Object> values = new HashMap<>(fields.size() + 2);
        values.put("index", index);
        values.put("offset", recordOffset);

        for (Field field : fields) {
            values.put(field.getName(), fieldReaders.read(this, br, field));
        }

        BeanWrapper wrapper = new BeanWrapperImpl(rowClass);
        wrapper.setPropertyValues(values);
        T value = (T) wrapper.getWrappedInstance();

        cachePut(value);

        return value;
    }

    /**
     * Calculate the size of a row.
     *
     * @return Calculated size of entity in bytes
     */
    private int calcEntitySize() {
        int size = 0;

        for (Field field : rowClass.getDeclaredFields()) {
            size += fieldReaders.size(field);
        }

        return size;
    }
}
