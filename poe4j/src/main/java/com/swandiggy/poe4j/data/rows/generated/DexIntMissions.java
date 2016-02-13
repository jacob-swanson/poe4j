
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
public class DexIntMissions
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private Boolean KillTarget;
    @Order(3)
    private Boolean FailIfTargetKilled;
    @Order(4)
    private Boolean KillGuards;
    @Order(5)
    private Boolean FailIfGuardsKilled;
    @Order(6)
    private int TimeLimit;
    @Order(7)
    private MonsterVarieties Hostage_MonsterVarietiesKey;
    @Order(8)
    private int MinLevel;
    @Order(9)
    private int MaxLevel;
    @Order(10)
    private Boolean ChestFlag0;
    @Order(11)
    private Boolean ChestFlag1;
    @Order(12)
    private NPCTalk NPCTalkKey;
    @Order(13)
    private Boolean FailIfNoGuardsLeft;
    @Order(14)
    private int Timer;
    @Order(15)
    private Boolean Flag7;
    @Order(16)
    private List<Long> Unknown11;

}
