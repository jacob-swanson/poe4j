
package com.swandiggy.poe4j.data.rows.gen;

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
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private List<String> variation_AOFiles;
    @Order(2)
    private Integer favourCost;
    @Order(3)
    private Integer masterLevel;
    @Order(4)
    private NPCMaster nPCMasterKey;
    @Order(5)
    private Boolean isNonMasterDoodad;
    @Order(6)
    private Integer unknown1;
    @Order(7)
    private Integer unknown2;
    @Order(8)
    private Integer unknown3;

}
