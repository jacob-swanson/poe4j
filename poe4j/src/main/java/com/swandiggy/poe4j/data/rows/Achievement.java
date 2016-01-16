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
@DatFile("Achievements")
public class Achievement extends BaseRow {

    @Order(1)
    private String id;

    @Order(2)
    private String description;

    @Order(3)
    private AchievementSetsDisplay achievementSetsDisplay;

    @Order(4)
    private String objective;

    @Order(5)
    private int unknown4;

    @Order(6)
    private boolean flag0;

    @Order(7)
    private boolean flag1;

    @Order(8)
    private boolean flag3;

    @Order(9)
    private int unknown3;

}
