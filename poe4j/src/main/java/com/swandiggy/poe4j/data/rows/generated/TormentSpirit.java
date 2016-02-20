
package com.swandiggy.poe4j.data.rows.generated;

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
    private MonsterVariety monsterVariety;
    @Order(1)
    private List<Mods> spiritMods;
    @Order(2)
    private List<Mods> touchedMods;
    @Order(3)
    private List<Mods> possessedMods;
    @Order(4)
    private int minZoneLevel;
    @Order(5)
    private int maxZoneLevel;
    @Order(6)
    private int spawnWeight;
    @Order(7)
    private MonsterVariety summonedMonsterMonsterVariety;
    @Order(8)
    private int unknown13;
    @Order(9)
    private List<Mods> modsKeys0;
    @Order(10)
    private List<Mods> modsKeys1;

}
