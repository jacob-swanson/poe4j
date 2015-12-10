package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jacob Swanson
 * @since 9/5/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Commands")
public class Command extends AbstractRow {
    @Order(1)
    private String id;

    @Order(2)
    private String command;

    @Order(3)
    private boolean flag;

    @Order(4)
    private String command2;
}
