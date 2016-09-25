
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapPins")
public class MapPins
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer positionX;
    @Order(2)
    private Integer positionY;
    @Order(3)
    private WorldAreas normalWaypoint_WorldAreasKey;
    @Order(4)
    private List<WorldAreas> normal_WorldAreasKeys;
    @Order(5)
    private String name;
    @Order(6)
    private String notes;
    @Order(7)
    private List<Integer> data1;
    @Order(8)
    private Integer act;
    @Order(9)
    private List<WorldAreas> merciless_WorldAreasKeys;
    @Order(10)
    private List<WorldAreas> cruel_WorldAreasKeys;
    @Order(11)
    private WorldAreas cruelWaypoint_WorldAreasKey;
    @Order(12)
    private WorldAreas mercilessWaypoint_WorldAreasKey;
    @Order(13)
    private String index3;
    @Order(14)
    private Integer unknown1;
    @Order(15)
    private List<WorldAreas> worldAreasKeys;
    @Order(16)
    private List<Integer> unknown3;

}
