package com.swandiggy.poe4j.ggpkg;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.ggpkg.record.DirectoryRecord;
import com.swandiggy.poe4j.ggpkg.record.FileRecord;
import com.swandiggy.poe4j.ggpkg.record.Record;
import com.swandiggy.poe4j.util.aspect.MonitorRuntime;
import com.swandiggy.poe4j.util.collection.Node;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.util.Assert;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service for extracting GGPKGs.
 *
 * @author Jacob Swanson
 * @since 9/3/2015
 */
@Slf4j
public class GgpkExtractor {

    public GgpkExtractor() {
    }

    /**
     * Extract a GGPK
     *
     * @param ggpk       Pack to extract.
     * @param extractDir Directory to extract to.
     */
    @MonitorRuntime("Extracted in %f seconds")
    public void extract(Ggpk ggpk, File extractDir) {
        Assert.notNull(ggpk);
        Assert.notNull(extractDir);

        log.info("Extracting '" + ggpk.getFile() + "' to '" + extractDir + "'");

        Comparator<Record> byRecordOffset = (r1, r2) -> Long.compare(r1.getRecordStart(), r2.getRecordStart());
        Instant lastLog = Instant.now();
        int count = 0;

        // Extract files in the order that they appear in the file
        try (FileChannel source = new RandomAccessFile(ggpk.getFile(), "r").getChannel()) {
            List<FileRecord> fileRecords = ggpk.getRecords().values().stream()
                    .filter(record -> record instanceof FileRecord)
                    .sorted(byRecordOffset)
                    .map(record -> (FileRecord) record)
                    .collect(Collectors.toList());

            for (FileRecord fileRecord : fileRecords) {
                extractFile(fileRecord, ggpk, extractDir, source);
                count++;
                if (lastLog.plus(10, ChronoUnit.SECONDS).isBefore(Instant.now())) {
                    log.info(String.format("Extraction %.2f percent complete", (double) count / (double) fileRecords.size() * 100.0));
                    lastLog = Instant.now();
                }
            }
        } catch (FileNotFoundException e) {
            throw new Poe4jException("Could not open GGPK file", e);
        } catch (IOException e) {
            throw new Poe4jException("Could not close GGPK file", e);
        }
    }

    @Cacheable("fileRecords")
    public FileRecord getFileRecord(Ggpk ggpk, String fullPath) {
        Path p = Paths.get(fullPath);

        final String finalFullPath = fullPath;
        return ggpk.getDirectoryTree()
                .values()
                .stream()
                .filter(node -> node.getData() instanceof FileRecord)
                .map(node -> (FileRecord) node.getData())
                .filter(record -> record.getName().equalsIgnoreCase(p.getFileName().toString()))
                .filter(record -> getFilePath(record, ggpk).equalsIgnoreCase(finalFullPath))
                .findAny()
                .orElseThrow(() -> new Poe4jException(MessageFormat.format("FileRecord {0} not found", finalFullPath)));
    }

    private void extractFile(FileRecord fileRecord, Ggpk ggpk, File extractDir, FileChannel source) {
        Assert.notNull(fileRecord);
        Assert.notNull(ggpk);
        Assert.notNull(extractDir);
        Assert.notNull(source);

        String relativePath = getFilePath(fileRecord, ggpk);

        log.debug("Extracting:  " + relativePath);

        File outputFile = Paths.get(extractDir.getAbsolutePath(), relativePath).toFile();
        outputFile.getParentFile().mkdirs();

        try (FileChannel destination = new FileOutputStream(outputFile).getChannel()) {
            source.position(fileRecord.getDataStart());
            long bytes = fileRecord.getDataLength();
            while (bytes > 0) {
                bytes -= destination.transferFrom(source, 0, fileRecord.getDataLength());
            }
        } catch (IOException e) {
            log.error("Error extracting file", e);
        }
    }

    private String getFilePath(FileRecord childRecord, Ggpk ggpk) {
        Assert.notNull(childRecord);
        Assert.notNull(ggpk);

        Node<Record> parent = ggpk.getDirectoryTree().get(childRecord.getRecordStart());
        List<Node<Record>> records = new ArrayList<>();
        while (parent != null) {
            records.add(parent);
            parent = parent.getParent();
        }

        String path = ((FileRecord) records.get(0).getData()).getName();
        for (int i = 1; i < records.size(); i++) {
            path = Paths.get(((DirectoryRecord) records.get(i).getData()).getName(), path).toString();
        }

        return path;
    }
}
