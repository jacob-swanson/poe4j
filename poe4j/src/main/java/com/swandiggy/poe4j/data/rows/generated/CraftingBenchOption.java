
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CraftingBenchOptions")
public class CraftingBenchOption
    extends BaseRow
{

    @Order(0)
    private NPCMaster npcMaster;
    @Order(1)
    private int order;
    @Order(2)
    private Mods mod;
    @Order(3)
    private List<BaseItemType> costBaseItemTypes;
    @Order(4)
    private List<Integer> costValue;
    @Order(5)
    private int masterLevel;
    @Order(6)
    private String name;
    @Order(7)
    private int unknown11;
    @Order(8)
    private List<ItemClass> itemClasses;
    @Order(9)
    private int socket;
    @Order(10)
    private String socketColour;
    @Order(11)
    private int link;
    @Order(12)
    private int itemQuantity;
    @Order(13)
    private List<Integer> unknown18;
    @Order(14)
    private String description;

}
