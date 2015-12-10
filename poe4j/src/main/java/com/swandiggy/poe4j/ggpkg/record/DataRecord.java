package com.swandiggy.poe4j.ggpkg.record;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Base class for records that have data in the GGPKG file.
 *
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class DataRecord extends Record {

    private final long dataStart;
    private final int dataLength;

    public DataRecord(long recordStart, int recordLength, long dataStart, int dataLength) {
        super(recordStart, recordLength);
        this.dataStart = dataStart;
        this.dataLength = dataLength;
    }
}
