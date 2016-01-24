package com.swandiggy.poe4j.data;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.swandiggy.poe4j.config.Poe4jProperties;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Setter;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.nio.file.Paths;

/**
 * Find a .dat file that goes with a class or find a class that goes with a .dat file.
 *
 * @author Jacob Swanson
 * @since 1/16/2016
 */
public class DatFileLookup {

    @Setter
    private Poe4jProperties properties;

    public DatFileLookup() {
    }

    public DatFileLookup(Poe4jProperties properties) {
        this.properties = properties;
    }

    /**
     * Map of .dat file names to rows classes
     */
    public static final BiMap<String, Class<?>> entityClasses = HashBiMap.create();

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

    public <T extends BaseRow> File getFileForType(Class<T> clazz) {
        return Paths.get(properties.getGgpkDirectory(), "Data", entityClasses.inverse().get(clazz) + ".dat").toFile();
    }

    public <T extends BaseRow> Class<T> getTypeForFile(File file) {
        return (Class<T>) entityClasses.get(file.getName());
    }
}
