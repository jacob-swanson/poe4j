
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DexIntMissions")
public class DexIntMission
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private Boolean killTarget;
    @Order(3)
    private Boolean failIfTargetKilled;
    @Order(4)
    private Boolean killGuards;
    @Order(5)
    private Boolean failIfGuardsKilled;
    @Order(6)
    private Integer timeLimit;
    @Order(7)
    private MonsterVarieties hostage_MonsterVarietiesKey;
    @Order(8)
    private Integer minLevel;
    @Order(9)
    private Integer maxLevel;
    @Order(10)
    private Boolean chestFlag0;
    @Order(11)
    private Boolean chestFlag1;
    @Order(12)
    private NPCTalk nPCTalkKey;
    @Order(13)
    private Boolean failIfNoGuardsLeft;
    @Order(14)
    private Integer timer;
    @Order(15)
    private Boolean flag7;
    @Order(16)
    private List<AchievementItem> achievementItemsKeys;

}
