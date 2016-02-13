
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class MapPins
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int PositionX;
    @Order(2)
    private int PositionY;
    @Order(3)
    private WorldAreas NormalWaypoint_WorldAreaKey;
    @Order(4)
    private List<WorldAreas> Normal_WorldAreaKeys;
    @Order(5)
    private String Name;
    @Order(6)
    private String Notes;
    @Order(7)
    private List<Integer> Data1;
    @Order(8)
    private int Unknown7;
    @Order(9)
    private int Act;
    @Order(10)
    private List<WorldAreas> Merciless_WorldAreaKeys;
    @Order(11)
    private List<WorldAreas> Cruel_WorldAreaKeys;
    @Order(12)
    private WorldAreas CruelWaypoint_WorldAreaKey;
    @Order(13)
    private WorldAreas MercilessWaypoint_WorldAreaKey;
    @Order(14)
    private String Index3;
    @Order(15)
    private int Unknown15;
    @Order(16)
    private List<WorldAreas> WorldAreaKeys;

}
