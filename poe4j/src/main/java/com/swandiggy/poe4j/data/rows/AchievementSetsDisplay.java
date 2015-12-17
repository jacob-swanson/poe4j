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
@DatFile("AchievementSetsDisplay")
public class AchievementSetsDisplay extends AbstractRow {

    @Order(1)
    private int id;

    @Order(2)
    private String title;

}
