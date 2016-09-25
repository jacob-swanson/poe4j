
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapConnections")
public class MapConnection
    extends BaseRow
{

    @Order(0)
    private MapPins mapPinsKey0;
    @Order(1)
    private MapPins mapPinsKey1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private String restrictedAreaText;
    @Order(4)
    private Integer unknown3;
    @Order(5)
    private Integer unknown4;
    @Order(6)
    private Integer unknown5;

}
