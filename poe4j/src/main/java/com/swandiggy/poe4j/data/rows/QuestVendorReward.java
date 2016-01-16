package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Jacob Swanson
 * @since 9/30/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestVendorRewards")
public class QuestVendorReward extends BaseRow {

    @Order(1)
    private int id;

    @Order(2)
    private NPC npc;

    @Order(3)
    private int questState;

    @Order(4)
    private List<Character> characters;

    @Order(5)
    private List<BaseItemType> baseItemTypes;

}
