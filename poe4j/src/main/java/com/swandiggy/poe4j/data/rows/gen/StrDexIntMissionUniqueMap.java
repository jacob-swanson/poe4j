
package com.swandiggy.poe4j.data.rows.gen;

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
    private Integer spawnWeight;
    @Order(2)
    private Integer minLevel;
    @Order(3)
    private Integer maxLevel;
    @Order(4)
    private WorldAreas worldAreasKey;
    @Order(5)
    private List<Mods> modsKeys;
    @Order(6)
    private List<MonsterVarieties> mapBoss_MonsterVarietiesKeys;

}
