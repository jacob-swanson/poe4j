
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("TormentSpirits")
public class TormentSpirit
    extends BaseRow
{

    @Order(0)
    private MonsterVarieties monsterVarietiesKey;
    @Order(1)
    private List<Mods> spirit_ModsKeys;
    @Order(2)
    private List<Mods> touched_ModsKeys;
    @Order(3)
    private List<Mods> possessed_ModsKeys;
    @Order(4)
    private Integer minZoneLevel;
    @Order(5)
    private Integer maxZoneLevel;
    @Order(6)
    private Integer spawnWeight;
    @Order(7)
    private MonsterVarieties summonedMonster_MonsterVarietiesKey;
    @Order(8)
    private Integer unknown13;
    @Order(9)
    private List<Mods> modsKeys0;
    @Order(10)
    private List<Mods> modsKeys1;

}
