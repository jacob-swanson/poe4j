package com.swandiggy.poe4j.ggpkg;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.ggpkg.factory.RecordFactory;
import com.swandiggy.poe4j.ggpkg.record.DirectoryRecord;
import com.swandiggy.poe4j.ggpkg.record.FileRecord;
import com.swandiggy.poe4j.ggpkg.record.Record;
import com.swandiggy.poe4j.util.aspect.MonitorRuntime;
import com.swandiggy.poe4j.util.collection.Node;
import com.swandiggy.poe4j.util.io.BinaryReader;
import com.swandiggy.poe4j.util.io.RafBinaryReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Future;

/**
 * Factory for {@link Ggpkg}.
 *
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Slf4j
@Service
public class GgpkgFactory {

    private final RecordFactory[] recordFactories;

    @Autowired
    public GgpkgFactory(RecordFactory[] recordFactories) {
        Assert.notEmpty(recordFactories);

        this.recordFactories = recordFactories;
    }

    @Async
    @MonitorRuntime("Loaded records in %f seconds")
    public Future<Ggpkg> loadAsync(File ggpkgFile) {
        return new AsyncResult<>(load(ggpkgFile));
    }

        /**
         * Parse a GGPKG's record structure.
         *
         * @param ggpkgFile Content.ggpk
         * @return Ggpkg record structure
         */
    @MonitorRuntime("Loaded records in %f seconds")
    public Ggpkg load(File ggpkgFile) {
        Assert.notNull(ggpkgFile);
        Assert.isTrue(ggpkgFile.exists(), "ggpkgFile did not exist");

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

        return new Ggpkg(records, ggpkgFile, nodes);
    }
}
