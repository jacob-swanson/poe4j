package com.swandiggy.poe4j.ggpkg.record;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a directory in the GGPKG. Contains a list of files and directories in the directory.
 *
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectoryRecord extends Record {

    private final String name;
    private final byte[] sha256Digest;
    private final List<DirectoryEntry> entries;

    public DirectoryRecord(long recordOffset, int recordLength, String name, byte[] sha256Digest, List<DirectoryEntry> entries) {
        super(recordOffset, recordLength);
        this.name = name;
        this.sha256Digest = Arrays.copyOf(sha256Digest, sha256Digest.length);
        this.entries = entries;
    }

    @Data
    @AllArgsConstructor
    public static class DirectoryEntry implements Serializable {
        private final int murmur2Hash;
        private final long recordStart;
    }
}
