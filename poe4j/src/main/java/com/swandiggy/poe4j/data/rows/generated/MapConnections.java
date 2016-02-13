
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class MapConnections
    extends BaseRow
{

    @Order(0)
    private MapPins MapPinsKey0;
    @Order(1)
    private MapPins MapPinsKey1;
    @Order(2)
    private int Unknown2;
    @Order(3)
    private String RestrictedAreaText;
    @Order(4)
    private int Unknown3;
    @Order(5)
    private int Unknown4;
    @Order(6)
    private int Unknown5;

}
