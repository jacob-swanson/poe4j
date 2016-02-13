
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class StrDexIntMissionExtraRequirement
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
    private int TimeLimit;
    @Order(5)
    private Boolean HasTimeBonusPerKill;
    @Order(6)
    private Boolean HasTimeBonusPerObjectTagged;
    @Order(7)
    private Boolean HasLimitedPortals;
    @Order(8)
    private NPCTalk NPCTalkKey;
    @Order(9)
    private int TimeLimitBonusFromObjective;
    @Order(10)
    private int ObjectCount;

}
