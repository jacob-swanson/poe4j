package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jacob Swanson
 * @since 9/30/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Tags")
public class Tag extends AbstractRow {

    @Order(1)
    private String id;

    @Order(2)
    private int unknown0;
}
