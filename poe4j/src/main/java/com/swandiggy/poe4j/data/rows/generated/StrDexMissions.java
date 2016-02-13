
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
public class StrDexMissions
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private int TimeLimit;
    @Order(3)
    private int MinLevel;
    @Order(4)
    private int MaxLevel;
    @Order(5)
    private MonsterVarieties Dummy_MonsterVarietiesKey;
    @Order(6)
    private int DummyCount;
    @Order(7)
    private int DummySpawnTimer;
    @Order(8)
    private NPCTalk NPCTalkKey;
    @Order(9)
    private List<MonsterVarieties> Allies_MonsterVarietiesKeys;
    @Order(10)
    private List<Long> Keys0;
    @Order(11)
    private int Unknown12;
    @Order(12)
    private List<MonsterVarieties> Traps_MonsterVarietiesKeys;

}
