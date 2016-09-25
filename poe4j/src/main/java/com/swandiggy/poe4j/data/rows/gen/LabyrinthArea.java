
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthAreas")
public class LabyrinthArea
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<WorldAreas> normal_WorldAreasKeys;
    @Order(2)
    private List<WorldAreas> cruel_WorldAreasKeys;
    @Order(3)
    private List<WorldAreas> merciless_WorldAreasKeys;
    @Order(4)
    private List<WorldAreas> endgame_WorldAreasKeys;

}
