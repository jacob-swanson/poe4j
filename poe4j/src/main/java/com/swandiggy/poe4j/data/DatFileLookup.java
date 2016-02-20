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
import com.swandiggy.poe4j.ggpkg.record.FileRecord;
import lombok.Data;
import lombok.Setter;
import org.reflections.Reflections;
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
    public static final BiMap<String, Class<?>> ROW_CLASSES = HashBiMap.create();

    /**
     * Collect all classes with @DatFile
     */
    static {
        Reflections reflections = new Reflections();
        for (Class<?> clazz : reflections.getTypesAnnotatedWith(DatFile.class)) {
            DatFile datFile = clazz.getAnnotation(DatFile.class);
            if (StringUtils.isEmpty(datFile.value())) {
                ROW_CLASSES.put(clazz.getSimpleName(), clazz);
            } else {
                ROW_CLASSES.put(datFile.value(), clazz);
            }
        }
    }

    @Data
    public static class FileDescription {
        private final File file;
        private final long start;
        private final long length;
    }

    public <T extends BaseRow> FileDescription getFileForType(Class<T> clazz) {
        if (StringUtils.hasText(properties.getGgpk())) {
            File file = new File(properties.getGgpk());
            if (!file.exists()) {
                throw new Poe4jException(MessageFormat.format("GGPK {0} not found", file));
            }

            if (file.isDirectory()) {
                File datFile = Paths.get(properties.getGgpk(), "Data", getRowClassFilename(clazz)).toFile();
                return new FileDescription(datFile, 0, datFile.length());
            } else if (file.isFile()) {
                Ggpk ggpk = ggpkFactory.load(new File(properties.getGgpk()));
                FileRecord fileRecord = ggpkExtractor.getFileRecord(ggpk, Paths.get("Data", getRowClassFilename(clazz)).toString());

                return new FileDescription(Paths.get(properties.getGgpk(), "Data", getRowClassFilename(clazz)).toFile(), fileRecord.getDataStart(), fileRecord.getDataLength());
            } else {
                throw new Poe4jException(MessageFormat.format("GGPK {0} not a file or directory", file));
            }
        } else {
            for (String location : properties.getGgpkLocations()) {
                File file = new File(location);
                if (!file.exists() || !file.isFile()) {
                    continue;
                }

                Ggpk ggpk = ggpkFactory.load(new File(location));
                FileRecord fileRecord = ggpkExtractor.getFileRecord(ggpk, Paths.get("Data", getRowClassFilename(clazz)).toString());
                return new FileDescription(file, fileRecord.getDataStart(), fileRecord.getDataLength());
            }

            throw new Poe4jException(MessageFormat.format("No GGPK found at {}", properties.getGgpkLocations()));
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends BaseRow> Class<T> getTypeForFile(File file) {
        return (Class<T>) ROW_CLASSES.get(file.getName());
    }

    private String getRowClassFilename(Class clazz) {
        return ROW_CLASSES.inverse().get(clazz) + ".dat";
    }
}
