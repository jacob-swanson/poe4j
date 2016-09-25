
package com.swandiggy.poe4j.data.rows.gen;

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
    private CharacterStartStates characterStartStatesKey;
    @Order(1)
    private Integer unknown2;
    @Order(2)
    private BaseItemTypes baseItemTypesKey;
    @Order(3)
    private List<Integer> sockets;
    @Order(4)
    private List<SkillGems> socketed_SkillGemsKeys;
    @Order(5)
    private List<Mods> modsKeys;
    @Order(6)
    private String inventoryIndex;
    @Order(7)
    private Integer slotX;
    @Order(8)
    private Integer slotY;
    @Order(9)
    private Integer stackSize;
    @Order(10)
    private List<Integer> links;
    @Order(11)
    private List<Integer> skillGemLevels;
    @Order(12)
    private Boolean flag0;
    @Order(13)
    private Long key0;

}
