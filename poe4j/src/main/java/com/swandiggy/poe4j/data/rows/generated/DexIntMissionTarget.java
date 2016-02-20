
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DexIntMissionTargets")
public class DexIntMissionTarget
    extends BaseRow
{

    @Order(0)
    private MonsterVariety monsterVariety;
    @Order(1)
    private int spawnWeight;
    @Order(2)
    private int minLevel;
    @Order(3)
    private int maxLevel;

}
