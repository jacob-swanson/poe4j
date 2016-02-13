
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
public class StrIntMissions
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private MonsterVarieties Relic_MonsterVarietiesKey;
    @Order(3)
    private int MinLevel;
    @Order(4)
    private int MaxLevel;
    @Order(5)
    private NPCTalk NPCTalkKey;
    @Order(6)
    private int f9;
    @Order(7)
    private Boolean HasTimeLimit;
    @Order(8)
    private int TimeLimit;
    @Order(9)
    private Boolean IsDestroyRelic1;
    @Order(10)
    private Boolean IsDestroyRelic2;
    @Order(11)
    private int FeedRequired;
    @Order(12)
    private int f12;
    @Order(13)
    private List<Mods> RelicModsKeys;
    @Order(14)
    private List<Long> Keys0;

}
