
package com.swandiggy.poe4j.data.rows.gen;

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
    private WorldAreas smallWorldAreasKey;
    @Order(2)
    private NPCMaster nPCMasterKey;
    @Order(3)
    private WorldAreas mediumWorldAreasKey;
    @Order(4)
    private WorldAreas largeWorldAreasKey;
    @Order(5)
    private Integer unknown9;

}
