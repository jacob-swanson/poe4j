package com.swandiggy.poe4j.data;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.Files;
import com.google.common.primitives.Primitives;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Enumerated;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.AbstractRow;
import com.swandiggy.poe4j.util.io.BinaryReader;
import com.swandiggy.poe4j.util.io.MappedBinaryReader;
import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Read records from a .dat file.
 *
 * @author Jacob Swanson
 * @since 9/5/2015
 */
@Slf4j
public class DatFileReader<T extends AbstractRow> implements Closeable {

    /**
     * Map of .dat file names to rows classes
     */
    private static final BiMap<String, Class<?>> entityClasses = HashBiMap.create();

    /**
     * Collect all classes with @DatFile
     */
    static {
        Reflections reflections = new Reflections();
        for (Class<?> clazz : reflections.getTypesAnnotatedWith(DatFile.class)) {
            DatFile datFile = clazz.getAnnotation(DatFile.class);
            if (StringUtils.isEmpty(datFile.value())) {
                entityClasses.put(clazz.getSimpleName(), clazz);
            } else {
                entityClasses.put(datFile.value(), clazz);
            }
        }
    }

    /*
     * Weak cache of records
     */
    private static final Cache<String, AbstractRow> recordCache = CacheBuilder.newBuilder().softValues().build();

    /**
     * Number of bytes primitives take in a rows
     */
    private static final ImmutableMap<Class<?>, Integer> dataSizes = ImmutableMap.<Class<?>, Integer>builder()
            .put(Integer.class, 4)
            .put(Long.class, 8)
            .put(String.class, 4)
            .put(Boolean.class, 1)
            .put(List.class, 8)
            .put(Short.class, 2)
            .put(Byte.class, 1)
            .build();

    /**
     * Separates the fixed width portion and the variable width portion of the .dat file
     */
    private static final long MAGIC_DATA_SEPARATOR = 0xBBbbBBbbBBbbBBbbL;

    /**
     * Value used for NULL references
     */
    private static final long MAGIC_NULL = 0xFEfeFEfeFEfeFEfeL;

    private File file; // .dat file
    private BinaryReader br; // reader for the file
    private long dataOffset; // Offset to the beginning of the variable width portion
    private int entitySize; // Size of a rows in the fixed width portion
    private List<Field> fields; // List of fields in the rows, sorted by @Order
    private Class<?> recordType; // Class to map records to
    private int count; // Number of records in the fixed width portion

    /**
     * Create a new .dat file reader.
     *
     * @param file Path to the .dat file
     */
    public DatFileReader(File file) {
        this.file = file;
        recordType = entityClasses.get(Files.getNameWithoutExtension(file.getName()));
        Assert.notNull(recordType, "Could not find rows class for '" + file.getName() + "'");

        // Get fields with @Order and sort them
        Comparator<Field> byOrder = (o1, o2) -> Integer.compare(o1.getAnnotation(Order.class).value(), o2.getAnnotation(Order.class).value());
        fields = Arrays.stream(recordType.getDeclaredFields())
                .filter(field -> field.getAnnotation(Order.class) != null)
                .sorted(byOrder)
                .collect(Collectors.toList());

        try {
            // Read basic stuff from the rows
            br = new MappedBinaryReader(file, "r");
            count = br.readInt();

            entitySize = getEntitySize(recordType);
            dataOffset = 4 + entitySize * count;

            // Check that the rows size is correct
            br.setPosition(dataOffset);
            long magic = br.readLong();
            Assert.isTrue(magic == MAGIC_DATA_SEPARATOR, "Data separator incorrect, rows size wrong");
            br.setPosition(4);
        } catch (Throwable t) {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new Poe4jException(e);
                }
            }
        }

    }

    @Override
    public void close() throws IOException {
        if (br != null) {
            br.close();
        }
    }

    private T cacheGet(long index) {
        String key = index + ":" + file.getName();
        if (recordCache.getIfPresent(key) != null) {
            return (T) recordCache.getIfPresent(key);
        }

        return null;
    }

    private void cachePut(T record) {
        String key = record.getIndex() + ":" + file.getName();
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
    private T read(long index) {
        checkBounds(index);

        if (cacheGet(index) != null) {
            return cacheGet(index);
        }

        log.info("Reading '" + index + "' from '" + file.getName() + "'");

        long recordOffset = index * entitySize + 4; // Index + size of rows + header
        if (br.getPosition() != recordOffset) {
            br.setPosition(recordOffset);
        }

        Map<String, Object> values = new HashMap<>(fields.size() + 1);
        values.put("index", index);
        values.put("offset", recordOffset);

        for (Field field : fields) {
            values.put(field.getName(), readField(field));
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

    private Object readField(Field field) {
        Class<?> fieldType = field.getType();
        if (fieldType == List.class) {
            int listSize = br.readInt();
            int listOffset = br.readInt();

            Class<?> listType = (Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];

            List<Object> listValues = new ArrayList<>(listSize);
            long pos = br.getPosition();
            br.setPosition(dataOffset + listOffset);
            for (int i = 0; i < listSize; i++) {
                listValues.add(readValue(listType));
            }
            br.setPosition(pos);

            return listValues;
        } else if (field.getAnnotation(Enumerated.class) != null) {
            Object value = readValue(Integer.class);

            try {
                Method m = field.getType().getMethod("valueOf", Integer.class);
                return m.invoke(null, value);
            } catch (NoSuchMethodException e) {
                throw new Poe4jException(field.getType().getSimpleName() + ".valueOf(" + Integer.class.getTypeName() + ") not found");
            } catch (InvocationTargetException | IllegalAccessException e) {
                throw new Poe4jException("Could not invoke valueOf method for enum", e);
            }
        } else {
            return readValue(fieldType);
        }
    }

    private Object readValue(Class<?> clazz) {
        if (Primitives.wrap(clazz) == Integer.class) {
            return br.readInt();
        } else if (Primitives.wrap(clazz) == Long.class) {
            return br.readLong();
        } else if (Primitives.wrap(clazz) == Boolean.class) {
            return br.readByte() == 1;
        } else if (Primitives.wrap(clazz) == Short.class) {
            return br.readShort();
        } else if (Primitives.wrap(clazz) == Byte.class) {
            return br.readByte();
        } else if (clazz == String.class) {
            int ref = br.readInt();

            long oldPos = br.getPosition();
            br.setPosition(dataOffset + ref);
            String s = br.readString("UTF-16LE");
            br.setPosition(oldPos);

            return s;
        } else if (entityClasses.containsValue(clazz)) {
            long index = br.readLong();
            if (index == MAGIC_NULL) {
                return null;
            }

            // Get the referenced .dat file
            try (DatFileReader datFileReader = new DatFileReader(Paths.get(file.getParent(), entityClasses.inverse().get(clazz) + ".dat").toFile())) {
                return datFileReader.read(index);
            } catch (IOException e) {
                throw new Poe4jException(e);
            }
        } else {
            throw new Poe4jException("Unsupported value type: " + clazz);
        }
    }

    /**
     * Calculate the size of a rows.
     *
     * @param clazz
     * @return
     */
    private int getEntitySize(Class<?> clazz) {
        int size = 0;

        for (Field field : clazz.getDeclaredFields()) {
            if (dataSizes.containsKey(Primitives.wrap(field.getType()))) {
                size += dataSizes.get(Primitives.wrap(field.getType()));
            } else if (field.getAnnotation(Enumerated.class) != null) {
                size += dataSizes.get(Integer.class);
            } else if (entityClasses.containsValue(field.getType())) {
                size += dataSizes.get(Long.class);
            } else {
                throw new Poe4jException("Unsupported field type: " + field);
            }
        }

        return size;
    }

    public BinaryReader getBr() {
        return br;
    }
}
