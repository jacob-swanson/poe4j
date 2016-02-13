
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
public class IntMissionMonsters
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private int MinLevel;
    @Order(3)
    private int MaxLevel;
    @Order(4)
    private List<MonsterVarieties> Objective_MonsterVarietiesKeys;
    @Order(5)
    private List<Long> Keys1;

}
