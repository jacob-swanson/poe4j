
package com.swandiggy.poe4j.data.rows.generated;

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
    private MapPin mapPinsKey0;
    @Order(1)
    private MapPin mapPinsKey1;
    @Order(2)
    private int unknown2;
    @Order(3)
    private String restrictedAreaText;
    @Order(4)
    private int unknown3;
    @Order(5)
    private int unknown4;
    @Order(6)
    private int unknown5;

}
