
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestRewards")
public class QuestReward
    extends BaseRow
{

    @Order(0)
    private Quest questKey;
    @Order(1)
    private Integer difficulty;
    @Order(2)
    private Integer unknown3;
    @Order(3)
    private Characters charactersKey;
    @Order(4)
    private BaseItemTypes baseItemTypesKey;
    @Order(5)
    private Integer itemLevel;
    @Order(6)
    private Integer rarity;
    @Order(7)
    private Integer unknown9;
    @Order(8)
    private String socketGems;
    @Order(9)
    private Long key0;
    @Order(10)
    private Long key1;
    @Order(11)
    private Integer unknown1;
    @Order(12)
    private Byte unknown2;

}
