
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DescentRewardChests")
public class DescentRewardChest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<BaseItemTypes> baseItemTypesKeys1;
    @Order(2)
    private List<BaseItemTypes> baseItemTypesKeys2;
    @Order(3)
    private List<BaseItemTypes> baseItemTypesKeys3;
    @Order(4)
    private List<BaseItemTypes> baseItemTypesKeys4;
    @Order(5)
    private List<BaseItemTypes> baseItemTypesKeys5;
    @Order(6)
    private List<BaseItemTypes> baseItemTypesKeys6;
    @Order(7)
    private List<BaseItemTypes> baseItemTypesKeys7;
    @Order(8)
    private List<BaseItemTypes> baseItemTypesKeys8;
    @Order(9)
    private List<BaseItemTypes> baseItemTypesKeys9;
    @Order(10)
    private List<BaseItemTypes> baseItemTypesKeys10;
    @Order(11)
    private List<BaseItemTypes> baseItemTypesKeys11;
    @Order(12)
    private List<BaseItemTypes> baseItemTypesKeys12;
    @Order(13)
    private WorldAreas worldAreasKey;
    @Order(14)
    private List<BaseItemTypes> baseItemTypesKeys13;
    @Order(15)
    private List<BaseItemTypes> baseItemTypesKeys14;

}
