package com.swandiggy.poe4j.data;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.config.Poe4jProperties;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.ggpkg.Ggpk;
import com.swandiggy.poe4j.ggpkg.GgpkExtractor;
import com.swandiggy.poe4j.ggpkg.GgpkFactory;
import lombok.Setter;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.nio.file.Paths;
import java.text.MessageFormat;

/**
 * Find a .dat file that goes with a class or find a class that goes with a .dat file.
 *
 * @author Jacob Swanson
 * @since 1/16/2016
 */
public class DatFileLookup {

    @Setter
    private Poe4jProperties properties;

    @Setter
    private GgpkFactory ggpkFactory;

    @Setter
    private GgpkExtractor ggpkExtractor;

    public DatFileLookup() {
    }

    public DatFileLookup(Poe4jProperties properties, GgpkFactory ggpkFactory, GgpkExtractor ggpkExtractor) {
        this.properties = properties;
        this.ggpkFactory = ggpkFactory;
        this.ggpkExtractor = ggpkExtractor;
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
        File file = new File(properties.getGgpkDirectory());
        if (!file.exists()) {
            throw new Poe4jException(MessageFormat.format("GGPK {0} not found", file));
        }

        if (file.isDirectory()) {
            return Paths.get(properties.getGgpkDirectory(), "Data", entityClasses.inverse().get(clazz) + ".dat").toFile();
        } else if (file.isFile()) {
            Ggpk ggpk = ggpkFactory.load(new File("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Path of Exile\\Content.ggpk"));
            return ggpkExtractor.getFileRecord(ggpk, Paths.get("Data", entityClasses.inverse().get(clazz) + ".dat").toString());
        } else {
            throw new Poe4jException(MessageFormat.format("GGPK {0} not a file or directory", file));
        }
    }

    public <T extends BaseRow> Class<T> getTypeForFile(File file) {
        return (Class<T>) entityClasses.get(file.getName());
    }
}
