package com.swandiggy.poe4j.ggpkg.record;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Arrays;

/**
 * Represents a file in the GGPKG.
 *
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FileRecord extends DataRecord {

    private final String name;
    private final byte[] sha256Digest;

    public FileRecord(long recordOffset, int recordLength, long dataOffset, int dataLength, String name, byte[] sha256Digest) {
        super(recordOffset, recordLength, dataOffset, dataLength);
        this.name = name;
        this.sha256Digest = Arrays.copyOf(sha256Digest, sha256Digest.length);
    }
}
