
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("RunicCircles")
public class RunicCircle
    extends BaseRow
{

    @Order(0)
    private int unknown1;
    @Order(1)
    private int unknown2;
    @Order(2)
    private int unknown3;
    @Order(3)
    private int unknown4;
    @Order(4)
    private int unknown5;

}
