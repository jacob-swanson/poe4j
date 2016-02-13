
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class CharacterStartItems
    extends BaseRow
{

    @Order(0)
    private CharacterStartStates CharacterStartStatesKey;
    @Order(1)
    private int Unknown2;
    @Order(2)
    private BaseItemTypes BaseItemTypesKey;
    @Order(3)
    private List<Integer> Sockets;
    @Order(4)
    private List<SkillGems> Socketed_SkillGemsKeys;
    @Order(5)
    private List<Mods> ModsKeys;
    @Order(6)
    private String InventoryIndex;
    @Order(7)
    private int SlotX;
    @Order(8)
    private int SlotY;
    @Order(9)
    private int StackSize;
    @Order(10)
    private List<Integer> Links;
    @Order(11)
    private List<Integer> SkillGemLevels;
    @Order(12)
    private Boolean Flag0;

}
