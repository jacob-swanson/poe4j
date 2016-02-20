
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("HideoutDoodads")
public class HideoutDoodad
    extends BaseRow
{

    @Order(0)
    private BaseItemType baseItemType;
    @Order(1)
    private List<String> variationAnimatedObjectFile;
    @Order(2)
    private int favourCost;
    @Order(3)
    private int masterLevel;
    @Order(4)
    private NPCMaster nPCMaster;
    @Order(5)
    private Boolean flag0;
    @Order(6)
    private int unknown1;
    @Order(7)
    private int unknown2;
    @Order(8)
    private int unknown3;

}
