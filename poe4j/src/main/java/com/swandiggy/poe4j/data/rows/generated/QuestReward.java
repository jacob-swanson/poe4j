
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.*;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestRewards")
public class QuestReward
    extends BaseRow
{

    @Order(0)
    private Quest quest;
    @Order(1)
    private int difficulty;
    @Order(2)
    private int unknown3;
    @Order(3)
    private Character character;
    @Order(4)
    private BaseItemType baseItemType;
    @Order(5)
    private int itemLevel;
    @Order(6)
    private int rarity;
    @Order(7)
    private int unknown9;
    @Order(8)
    private String socketGem;
    @Order(9)
    private Long key0;
    @Order(10)
    private Long key1;

}
