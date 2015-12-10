package com.swandiggy.poe4j.ggpkg.record;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Arrays;

/**
 * First rows in the GGPKG file. Should contain two records, the first to the root directory, and the other to a
 * {@link FreeRecord}.
 *
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GgpkgRecord extends Record {

    private final long[] recordOffsets;

    public GgpkgRecord(long recordStart, int recordLength, long[] recordOffsets) {
        super(recordStart, recordLength);
        this.recordOffsets = Arrays.copyOf(recordOffsets, recordOffsets.length);
    }
}
