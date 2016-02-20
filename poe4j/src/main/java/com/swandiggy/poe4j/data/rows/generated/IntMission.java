
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("IntMissions")
public class IntMission
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int spawnWeight;
    @Order(2)
    private int minLevel;
    @Order(3)
    private int maxLevel;
    @Order(4)
    private NPCTalk npcTalk;
    @Order(5)
    private Boolean flag0;
    @Order(6)
    private int unknown6;
    @Order(7)
    private Boolean flag1;
    @Order(8)
    private Boolean flag2;
    @Order(9)
    private Boolean flag3;
    @Order(10)
    private int unknown8;
    @Order(11)
    private int monsterPerSpawnCount;
    @Order(12)
    private int objectiveCount;
    @Order(13)
    private Boolean flag4;
    @Order(14)
    private Boolean flag5;
    @Order(15)
    private Boolean flag6;
    @Order(16)
    private Boolean flag7;
    @Order(17)
    private Boolean flag8;
    @Order(18)
    private Boolean flag9;
    @Order(19)
    private Boolean flag10;
    @Order(20)
    private MonsterVariety monsterVariety;
    @Order(21)
    private int unknown13;

}
