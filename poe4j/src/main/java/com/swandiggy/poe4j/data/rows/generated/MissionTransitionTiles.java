
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class MissionTransitionTiles
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String TDTFile;
    @Order(2)
    private int Unknown2;
    @Order(3)
    private int Unknown3;
    @Order(4)
    private int Unknown4;

}
