
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
@DatFile("StrDexMissions")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class StrDexMission
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int spawnWeight;
    @Order(2)
    private int timeLimit;
    @Order(3)
    private int minLevel;
    @Order(4)
    private int maxLevel;
    @Order(5)
    private MonsterVariety dummyMonsterVariety;
    @Order(6)
    private int dummyCount;
    @Order(7)
    private int dummySpawnTimer;
    @Order(8)
    private NPCTalk nPCTalk;
    @Order(9)
    private List<MonsterVariety> alliesMonsterVarieties;
    @Order(10)
    private List<Long> keys0;
    @Order(11)
    private int unknown12;
    @Order(12)
    private List<MonsterVariety> trapsMonsterVarieties;

}
