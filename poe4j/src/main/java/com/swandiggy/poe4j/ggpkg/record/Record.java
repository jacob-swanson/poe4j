package com.swandiggy.poe4j.ggpkg.record;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Jacob Swanson
 * @since 8/31/2015
 */
@Data
@AllArgsConstructor
public abstract class Record implements Serializable {
    private final long recordStart;
    private final int recordLength;
}
