package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jacob Swanson
 * @since 12/17/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AchievementItems")
public class AchievementItem extends AbstractRow {

    @Order(1)
    private String id;

    @Order(2)
    private int unknown1;

    @Order(3)
    private int unknown2;

    @Order(4)
    private String name;

    @Order(5)
    private int unknown4;

    @Order(6)
    private Achievement achievement;

    @Order(7)
    private boolean flag0;

}
