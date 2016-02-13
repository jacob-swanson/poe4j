
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class QuestRewards
    extends BaseRow
{

    @Order(0)
    private Quest QuestKey;
    @Order(1)
    private int Difficulty;
    @Order(2)
    private int Unknown3;
    @Order(3)
    private Characters CharactersKey;
    @Order(4)
    private BaseItemTypes BaseItemTypesKey;
    @Order(5)
    private int ItemLevel;
    @Order(6)
    private int Rarity;
    @Order(7)
    private int Unknown9;
    @Order(8)
    private String SocketGems;
    @Order(9)
    private Long Key0;
    @Order(10)
    private Long Key1;

}
