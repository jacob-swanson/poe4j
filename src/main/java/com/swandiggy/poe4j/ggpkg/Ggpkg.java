package com.swandiggy.poe4j.ggpkg;

import com.swandiggy.poe4j.ggpkg.record.Record;
import com.swandiggy.poe4j.util.collection.Node;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.File;
import java.util.Map;

/**
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Data
@AllArgsConstructor
public class Ggpkg {
    private Map<Long, Record> records;
    private File file;
    private Map<Long, Node<Record>> directoryTree;
}
