
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Hideouts")
public class Hideout
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private WorldArea smallWorldArea;
    @Order(2)
    private NPCMaster npcMaster;
    @Order(3)
    private WorldArea mediumWorldArea;
    @Order(4)
    private WorldArea largeWorldArea;
    @Order(5)
    private int unknown9;

}
