
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DexMissionMonsters")
public class DexMissionMonster
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<MonsterPack> monsterPacks;
    @Order(2)
    private int spawnWeight;
    @Order(3)
    private int minLevel;
    @Order(4)
    private int maxLevel;
    @Order(5)
    private List<MonsterVariety> monsterVarieties;

}
