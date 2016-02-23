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
import java.util.Arrays;

/**
 * Find a .dat file that goes with a class or find a class that goes with a .dat file.
 *
 * @author Jacob Swanson
 * @since 1/16/2016
 */
public class DataFileResolver {

    @Setter
    private Poe4jProperties properties;

    @Setter
    private GgpkFactory ggpkFactory;

    @Setter
    private GgpkExtractor ggpkExtractor;

    public DataFileResolver() {
    }

    public DataFileResolver(Poe4jProperties properties, GgpkFactory ggpkFactory, GgpkExtractor ggpkExtractor) {
        this.properties = properties;
        this.ggpkFactory = ggpkFactory;
        this.ggpkExtractor = ggpkExtractor;
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
                File datFile = Paths.get(properties.getGgpk(), "Data", DataFileRegistry.getFileForType(clazz)).toFile();
                return new FileDescription(datFile, 0, datFile.length());
            } else if (file.isFile()) {
                Ggpk ggpk = ggpkFactory.load(new File(properties.getGgpk()));
                FileRecord fileRecord = ggpkExtractor.getFileRecord(ggpk, Paths.get("Data", DataFileRegistry.getFileForType(clazz)).toString());

                return new FileDescription(new File(properties.getGgpk()), fileRecord.getDataStart(), fileRecord.getDataLength());
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
                FileRecord fileRecord = ggpkExtractor.getFileRecord(ggpk, Paths.get("Data", DataFileRegistry.getFileForType(clazz)).toString());
                return new FileDescription(file, fileRecord.getDataStart(), fileRecord.getDataLength());
            }

            throw new Poe4jException(MessageFormat.format("No GGPK found at {0}", Arrays.toString(properties.getGgpkLocations())));
        }
    }


}
