
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrIntMissionMonsterWaves")
public class StrIntMissionMonsterWave
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private MonsterPack monsterPack;
    @Order(2)
    private int waveCount;
    @Order(3)
    private int spawnWeight;
    @Order(4)
    private int minLevel;
    @Order(5)
    private int maxLevel;
    @Order(6)
    private int packTimer;
    @Order(7)
    private int timeLimit;
    @Order(8)
    private List<MonsterVariety> uniqueMonsterVarieties;
    @Order(9)
    private Long key0;
    @Order(10)
    private List<Integer> unknown13;
    @Order(11)
    private int uniqueCount;

}
