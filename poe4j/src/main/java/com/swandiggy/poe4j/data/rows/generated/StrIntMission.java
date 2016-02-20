
package com.swandiggy.poe4j.data.rows.generated;

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
    private int spawnWeight;
    @Order(2)
    private MonsterVariety relicMonsterVariety;
    @Order(3)
    private int minLevel;
    @Order(4)
    private int maxLevel;
    @Order(5)
    private NPCTalk nPCTalk;
    @Order(6)
    private int f9;
    @Order(7)
    private Boolean hasTimeLimit;
    @Order(8)
    private int timeLimit;
    @Order(9)
    private Boolean isDestroyRelic1;
    @Order(10)
    private Boolean isDestroyRelic2;
    @Order(11)
    private int feedRequired;
    @Order(12)
    private int f12;
    @Order(13)
    private List<Mods> relicMods;
    @Order(14)
    private List<Long> keys0;

}
