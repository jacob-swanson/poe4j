
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CharacterStartItems")
public class CharacterStartItem
    extends BaseRow
{

    @Order(0)
    private CharacterStartState characterStartState;
    @Order(1)
    private int unknown2;
    @Order(2)
    private BaseItemType baseItemType;
    @Order(3)
    private List<Integer> sockets;
    @Order(4)
    private List<SkillGems> socketedSkillGems;
    @Order(5)
    private List<Mods> mods;
    @Order(6)
    private String inventoryIndex;
    @Order(7)
    private int slotX;
    @Order(8)
    private int slotY;
    @Order(9)
    private int stackSize;
    @Order(10)
    private List<Integer> link;
    @Order(11)
    private List<Integer> skillGemLevel;
    @Order(12)
    private Boolean flag0;
    @Order(13)
    private Long key0;
}
