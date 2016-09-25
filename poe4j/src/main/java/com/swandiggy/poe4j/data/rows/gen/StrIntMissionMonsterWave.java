
package com.swandiggy.poe4j.data.rows.gen;

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
    private MonsterPacks monsterPacksKey;
    @Order(2)
    private Integer waveCount;
    @Order(3)
    private Integer spawnWeight;
    @Order(4)
    private Integer minLevel;
    @Order(5)
    private Integer maxLevel;
    @Order(6)
    private Integer packTimer;
    @Order(7)
    private Integer timeLimit;
    @Order(8)
    private List<MonsterVarieties> unique_MonsterVarietiesKeys;
    @Order(9)
    private Long key0;
    @Order(10)
    private List<Integer> unknown13;
    @Order(11)
    private Integer uniqueCount;

}
