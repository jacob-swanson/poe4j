
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class CraftingBenchOptions
    extends BaseRow
{

    @com.swandiggy.poe4j.data.annotations.Order(0)
    private NPCMaster NPCMasterKey;
    @com.swandiggy.poe4j.data.annotations.Order(1)
    private int Order;
    @com.swandiggy.poe4j.data.annotations.Order(2)
    private Mods ModsKey;
    @com.swandiggy.poe4j.data.annotations.Order(3)
    private List<BaseItemTypes> Cost_BaseItemTypesKeys;
    @com.swandiggy.poe4j.data.annotations.Order(4)
    private List<Integer> Cost_Values;
    @com.swandiggy.poe4j.data.annotations.Order(5)
    private int MasterLevel;
    @com.swandiggy.poe4j.data.annotations.Order(6)
    private String Name;
    @com.swandiggy.poe4j.data.annotations.Order(7)
    private int Unknown11;
    @com.swandiggy.poe4j.data.annotations.Order(8)
    private List<ItemClasses> ItemClassesKeys;
    @com.swandiggy.poe4j.data.annotations.Order(9)
    private int Sockets;
    @com.swandiggy.poe4j.data.annotations.Order(10)
    private String SocketColours;
    @com.swandiggy.poe4j.data.annotations.Order(11)
    private int Links;
    @com.swandiggy.poe4j.data.annotations.Order(12)
    private int ItemQuantity;
    @com.swandiggy.poe4j.data.annotations.Order(13)
    private List<Integer> Unknown18;

}
