package com.swandiggy.poe4j.ggpkg;

import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.ggpkg.record.DirectoryRecord;
import com.swandiggy.poe4j.ggpkg.record.FileRecord;
import com.swandiggy.poe4j.ggpkg.record.Record;
import com.swandiggy.poe4j.util.collection.Node;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.util.Assert;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Data
@EqualsAndHashCode(of = "file")
@AllArgsConstructor
public class Ggpk {
    private Map<Long, Record> records;
    private File file;
    private Map<Long, Node<Record>> directoryTree;
}
