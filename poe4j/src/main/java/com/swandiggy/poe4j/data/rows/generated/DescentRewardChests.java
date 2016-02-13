
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
public class DescentRewardChests
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private List<BaseItemTypes> BaseItemTypesKeys1;
    @Order(2)
    private List<BaseItemTypes> BaseItemTypesKeys2;
    @Order(3)
    private List<BaseItemTypes> BaseItemTypesKeys3;
    @Order(4)
    private List<BaseItemTypes> BaseItemTypesKeys4;
    @Order(5)
    private List<BaseItemTypes> BaseItemTypesKeys5;
    @Order(6)
    private List<BaseItemTypes> BaseItemTypesKeys6;
    @Order(7)
    private List<BaseItemTypes> BaseItemTypesKeys7;
    @Order(8)
    private List<BaseItemTypes> BaseItemTypesKeys8;
    @Order(9)
    private List<BaseItemTypes> BaseItemTypesKeys9;
    @Order(10)
    private List<BaseItemTypes> BaseItemTypesKeys10;
    @Order(11)
    private List<BaseItemTypes> BaseItemTypesKeys11;
    @Order(12)
    private List<BaseItemTypes> BaseItemTypesKeys12;
    @Order(13)
    private WorldAreas WorldAreasKey;
    @Order(14)
    private List<BaseItemTypes> BaseItemTypesKeys13;
    @Order(15)
    private List<BaseItemTypes> BaseItemTypesKeys14;

}
