package com.swandiggy.poe4j.ggpkg.record;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Represents free space in the GGPKG.
 *
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FreeRecord extends DataRecord {

    private final long nextFree;

    public FreeRecord(long recordStart, int recordLength, long dataStart, int dataLength, long nextFree) {
        super(recordStart, recordLength, dataStart, dataLength);
        this.nextFree = nextFree;
    }
}


