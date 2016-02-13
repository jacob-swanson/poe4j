
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
public class TormentSpirits
    extends BaseRow
{

    @Order(0)
    private MonsterVarieties MonsterVarietiesKey;
    @Order(1)
    private List<Mods> Spirit_ModsKeys;
    @Order(2)
    private List<Mods> Touched_ModsKeys;
    @Order(3)
    private List<Mods> Possessed_ModsKeys;
    @Order(4)
    private int MinZoneLevel;
    @Order(5)
    private int MaxZoneLevel;
    @Order(6)
    private int SpawnWeight;
    @Order(7)
    private MonsterVarieties SummonedMonster_MonsterVarietiesKey;
    @Order(8)
    private int Unknown13;
    @Order(9)
    private List<Mods> ModsKeys0;
    @Order(10)
    private List<Mods> ModsKeys1;

}
