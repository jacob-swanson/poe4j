package com.swandiggy.poe4j.ggpkg;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.rows.BaseRow;
import com.swandiggy.poe4j.ggpkg.factory.RecordFactory;
import com.swandiggy.poe4j.ggpkg.record.DirectoryRecord;
import com.swandiggy.poe4j.ggpkg.record.FileRecord;
import com.swandiggy.poe4j.ggpkg.record.Record;
import com.swandiggy.poe4j.util.aspect.MonitorRuntime;
import com.swandiggy.poe4j.util.collection.Node;
import com.swandiggy.poe4j.util.io.BinaryReader;
import com.swandiggy.poe4j.util.io.RafBinaryReader;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Factory for {@link Ggpk}.
 *
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Slf4j
public class GgpkFactory {

    /**
     * Weak cache of records
     */
    private static final Cache<String, Ggpk> ggpkCache = CacheBuilder.newBuilder().softValues().build();

    private Ggpk cacheGet(File file) {
        String key = file.toString();
        if (ggpkCache.getIfPresent(key) != null) {
            return ggpkCache.getIfPresent(key);
        }

        return null;
    }

    private void cachePut(Ggpk ggpk) {
        String key = ggpk.getFile().toString();
        ggpkCache.put(key, ggpk);
    }

    @Setter
    private RecordFactory[] recordFactories;

    public GgpkFactory() {
    }

    public GgpkFactory(RecordFactory[] recordFactories) {
        Assert.notEmpty(recordFactories);

        this.recordFactories = recordFactories;
    }

    /**
     * Parse a GGPKG's record structure.
     *
     * @param ggpkgFile Content.ggpk
     * @return Ggpk record structure
     */
    @MonitorRuntime("Loaded records in %f seconds")
    public Ggpk load(File ggpkgFile) {
        Assert.notNull(ggpkgFile);
        Assert.isTrue(ggpkgFile.exists(), "ggpkgFile did not exist");

        if (cacheGet(ggpkgFile) != null) {
            return cacheGet(ggpkgFile);
        }

        log.info("Loading '" + ggpkgFile + "'");

        Map<Long, Record> records = new HashMap<>();

        // Extract records
        try (BinaryReader br = new RafBinaryReader(ggpkgFile, "r")) {
            while (br.getPosition() < br.length()) {
                long recordOffset = br.getPosition();
                int recordLength = br.readInt();

                String tag = br.readString(4);
                Optional<RecordFactory> factory = Arrays.stream(recordFactories)
                        .filter(recordFactory -> recordFactory.supports(tag))
                        .findAny();

                if (!factory.isPresent()) {
                    throw new RuntimeException("No factory for tag: '" + tag + "'");
                }

                records.put(recordOffset, factory.get().read(br, recordOffset, recordLength));
            }
        } catch (IOException e) {
            throw new Poe4jException("Could not close reader", e);
        }

        // Create all of the nodes for the directory structure
        Map<Long, Node<Record>> nodes = new HashMap<>();
        records.values().stream()
                .filter(record -> record instanceof FileRecord || record instanceof DirectoryRecord)
                .map(Node::new)
                .forEach(recordNode -> nodes.put(recordNode.getData().getRecordStart(), recordNode));

        // Connect all of the nodes together
        nodes.values().stream()
                .filter(recordNode -> recordNode.getData() instanceof DirectoryRecord)
                .forEach(recordNode -> {
                    for (DirectoryRecord.DirectoryEntry directoryEntry : ((DirectoryRecord) recordNode.getData()).getEntries()) {
                        Node<Record> childNode = nodes.get(directoryEntry.getRecordStart());
                        recordNode.addChild(childNode);
                        childNode.setParent(recordNode);
                    }
                });

        Ggpk ggpk = new Ggpk(records, ggpkgFile, nodes);
        cachePut(ggpk);

        return ggpk;
    }
}
