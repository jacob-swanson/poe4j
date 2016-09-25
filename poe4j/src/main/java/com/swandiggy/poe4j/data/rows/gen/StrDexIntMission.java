
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrDexIntMissions")
public class StrDexIntMission
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private Boolean hasObjectiveBossKill;
    @Order(3)
    private Boolean hasObjectiveFullClear;
    @Order(4)
    private List<Mods> extra_ModsKeys;
    @Order(5)
    private Integer unknown4;
    @Order(6)
    private Integer unknown5;
    @Order(7)
    private Boolean hasObjectiveKillExiles;
    @Order(8)
    private Boolean hasObjectiveFindUnique;
    @Order(9)
    private Long key0;
    @Order(10)
    private Boolean hasObjectiveCompleteMasterMission;
    @Order(11)
    private NPCTalk nPCTalkKey;
    @Order(12)
    private MonsterPacks monsterPacksKey;
    @Order(13)
    private Integer objectCountRequired;
    @Order(14)
    private Integer objectCountTotal;
    @Order(15)
    private List<AchievementItem> achievementItemsKeys;

}
