
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrDexMissions")
public class StrDexMission
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private Integer timeLimit;
    @Order(3)
    private Integer minLevel;
    @Order(4)
    private Integer maxLevel;
    @Order(5)
    private MonsterVarieties dummy_MonsterVarietiesKey;
    @Order(6)
    private Integer dummyCount;
    @Order(7)
    private Integer dummySpawnTimer;
    @Order(8)
    private NPCTalk nPCTalkKey;
    @Order(9)
    private List<MonsterVarieties> allies_MonsterVarietiesKeys;
    @Order(10)
    private List<Mods> modsKeys;
    @Order(11)
    private Integer unknown12;
    @Order(12)
    private List<MonsterVarieties> traps_MonsterVarietiesKeys;

}
