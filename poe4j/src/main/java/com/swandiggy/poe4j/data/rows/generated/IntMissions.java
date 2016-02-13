
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class IntMissions
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
    private NPCTalk NPCTalkKey;
    @Order(5)
    private Boolean Flag0;
    @Order(6)
    private int Unknown6;
    @Order(7)
    private Boolean Flag1;
    @Order(8)
    private Boolean Flag2;
    @Order(9)
    private Boolean Flag3;
    @Order(10)
    private int Unknown8;
    @Order(11)
    private int MonsterPerSpawnCount;
    @Order(12)
    private int ObjectiveCount;
    @Order(13)
    private Boolean Flag4;
    @Order(14)
    private Boolean Flag5;
    @Order(15)
    private Boolean Flag6;
    @Order(16)
    private Boolean Flag7;
    @Order(17)
    private Boolean Flag8;
    @Order(18)
    private Boolean Flag9;
    @Order(19)
    private Boolean Flag10;
    @Order(20)
    private MonsterVarieties MonsterVarietiesKey;
    @Order(21)
    private int Unknown13;

}
