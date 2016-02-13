
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Hideouts
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private WorldAreas SmallWorldAreasKey;
    @Order(2)
    private NPCMaster NPCMasterKey;
    @Order(3)
    private WorldAreas MediumWorldAreasKey;
    @Order(4)
    private WorldAreas LargeWorldAreasKey;
    @Order(5)
    private int Unknown9;

}
