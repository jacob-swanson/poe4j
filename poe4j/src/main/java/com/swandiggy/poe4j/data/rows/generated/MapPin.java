
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapPins")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class MapPin
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int positionX;
    @Order(2)
    private int positionY;
    @Order(3)
    private WorldArea normalWaypointWorldArea;
    @Order(4)
    private List<WorldArea> normalWorldArea;
    @Order(5)
    private String name;
    @Order(6)
    private String note;
    @Order(7)
    private List<Integer> data1;
    @Order(8)
    private int unknown7;
    @Order(9)
    private int act;
    @Order(10)
    private List<WorldArea> mercilessWorldArea;
    @Order(11)
    private List<WorldArea> cruelWorldArea;
    @Order(12)
    private WorldArea cruelWaypointWorldArea;
    @Order(13)
    private WorldArea mercilessWaypointWorldArea;
    @Order(14)
    private String index3;
    @Order(15)
    private int unknown15;
    @Order(16)
    private List<WorldArea> worldArea;

}
