
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrIntMissions")
public class StrIntMission
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private MonsterVarieties relic_MonsterVarietiesKey;
    @Order(3)
    private Integer minLevel;
    @Order(4)
    private Integer maxLevel;
    @Order(5)
    private NPCTalk nPCTalkKey;
    @Order(6)
    private Integer f9;
    @Order(7)
    private Boolean hasTimeLimit;
    @Order(8)
    private Integer timeLimit;
    @Order(9)
    private Boolean isDestroyRelic1;
    @Order(10)
    private Boolean isDestroyRelic2;
    @Order(11)
    private Integer feedRequired;
    @Order(12)
    private Integer f12;
    @Order(13)
    private List<Mods> relicModsKeys;
    @Order(14)
    private List<AchievementItem> achievementItemsKeys;

}
