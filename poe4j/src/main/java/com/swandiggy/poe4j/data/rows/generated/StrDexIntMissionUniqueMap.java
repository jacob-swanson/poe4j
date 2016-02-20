
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrDexIntMissionUniqueMaps")
public class StrDexIntMissionUniqueMap
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private int spawnWeight;
    @Order(2)
    private int minLevel;
    @Order(3)
    private int maxLevel;
    @Order(4)
    private WorldArea worldArea;
    @Order(5)
    private List<Mods> mods;
    @Order(6)
    private List<MonsterVariety> mapBossMonsterVarieties;

}
