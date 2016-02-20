
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrDexIntMissionExtraRequirement")
public class StrDexIntMissionExtraRequirement
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
    private int timeLimit;
    @Order(5)
    private Boolean hasTimeBonusPerKill;
    @Order(6)
    private Boolean hasTimeBonusPerObjectTagged;
    @Order(7)
    private Boolean hasLimitedPortal;
    @Order(8)
    private NPCTalk nPCTalk;
    @Order(9)
    private int timeLimitBonusFromObjective;
    @Order(10)
    private int objectCount;

}
