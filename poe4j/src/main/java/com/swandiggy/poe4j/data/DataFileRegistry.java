package com.swandiggy.poe4j.data;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.rows.BaseRow;
import org.reflections.Reflections;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.Set;

/**
 * Holds references to all of the registered data file entities.
 *
 * @author Jacob Swanson
 * @since 1/16/2016
 */
public final class DataFileRegistry {

    private DataFileRegistry() {
    }

    /**
     * Map of .dat file names to rows classes
     */
    private static final BiMap<String, Class<? extends BaseRow>> ROW_CLASSES = HashBiMap.create();

    static {
        Reflections reflections = new Reflections();
        reflections
                .getTypesAnnotatedWith(DatFile.class)
                .stream()
                .forEach(clazz -> {
                    DatFile datFile = clazz.getAnnotation(DatFile.class);
                    if (StringUtils.isEmpty(datFile.value())) {
                        registerType((Class<? extends BaseRow>) clazz, clazz.getSimpleName());
                    } else {
                        registerType((Class<? extends BaseRow>) clazz, datFile.value());
                    }
                });

    }

    /**
     * Register a data file entity. If the type is already registered it will be replaced.
     *
     * @param type class to construct
     * @param dataFileName name of data file without .dat
     */
    public static void registerType(Class<? extends BaseRow> type, String dataFileName) {
        ROW_CLASSES.forcePut(dataFileName, type);
    }

    /**
     * Get a row class for the given file.
     *
     * @param file
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T extends BaseRow> Class<T> getTypeForFile(File file) {
        Class<? extends BaseRow> clazz = ROW_CLASSES.get(file.getName());
        if (clazz == null) {
            throw new Poe4jException("Could not find class for " + file);
        }

        return (Class<T>) clazz;
    }

    /**
     * Get a file name for the given class.
     *
     * @param clazz
     * @return
     */
    public static String getFileForType(Class clazz) {
        String filename = ROW_CLASSES.inverse().get(clazz);
        if (filename == null) {
            throw new Poe4jException("Could not find file for " + clazz);
        }

        return filename + ".dat";
    }

    /**
     * Check if a class is registered.
     *
     * @param clazz
     * @return
     */
    public static boolean isRegistered(Class clazz) {
        return ROW_CLASSES.containsValue(clazz);
    }

    /**
     * Get set of registered types.
     *
     * @return
     */
    public static Set<Class<? extends BaseRow>> getRegisteredTypes() {
        return ROW_CLASSES.values();
    }
}
