package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Enumerated;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.enums.Difficulty;
import com.swandiggy.poe4j.data.enums.QuestItemType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jacob Swanson
 * @since 9/16/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestRewards")
public class QuestReward extends BaseRow {

    @Order(1)
    private Quest quest;

    @Order(2)
    @Enumerated
    private Difficulty difficulty;

    @Order(3)
    private int type;

    @Order(4)
    private Character character;

    @Order(5)
    private BaseItemType baseItemType;

    @Order(6)
    private int itemLevel;

    @Order(7)
    @Enumerated
    private QuestItemType questItemType;

    @Order(8)
    private int unknown9;

    @Order(9)
    private String socketGems;

    @Order(10)
    private long uniqueId;

    @Order(11)
    private int unknown12;

    @Order(12)
    private int unknown13;

}
