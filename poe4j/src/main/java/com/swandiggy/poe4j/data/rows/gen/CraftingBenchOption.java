
package com.swandiggy.poe4j.data.rows.gen;

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
    private NPCMaster nPCMasterKey;
    @Order(1)
    private Integer order;
    @Order(2)
    private Mods modsKey;
    @Order(3)
    private List<BaseItemTypes> cost_BaseItemTypesKeys;
    @Order(4)
    private List<Integer> cost_Values;
    @Order(5)
    private Integer masterLevel;
    @Order(6)
    private String name;
    @Order(7)
    private Integer unknown0;
    @Order(8)
    private List<ItemClasses> itemClassesKeys;
    @Order(9)
    private Integer sockets;
    @Order(10)
    private String socketColours;
    @Order(11)
    private Integer links;
    @Order(12)
    private Integer itemQuantity;
    @Order(13)
    private List<Integer> unknown1;
    @Order(14)
    private String description;

}
