
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
public class HideoutDoodads
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes BaseItemTypesKey;
    @Order(1)
    private List<String> Variation_AnimatedObjectFiles;
    @Order(2)
    private int FavourCost;
    @Order(3)
    private int MasterLevel;
    @Order(4)
    private NPCMaster NPCMasterKey;
    @Order(5)
    private Boolean Flag0;
    @Order(6)
    private int Unknown1;
    @Order(7)
    private int Unknown2;
    @Order(8)
    private int Unknown3;

}
