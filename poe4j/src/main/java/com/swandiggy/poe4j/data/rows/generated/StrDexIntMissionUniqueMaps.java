
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
public class StrDexIntMissionUniqueMaps
    extends BaseRow
{

    @Order(0)
    private Long Key0;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private int MinLevel;
    @Order(3)
    private int MaxLevel;
    @Order(4)
    private WorldAreas WorldAreasKey;
    @Order(5)
    private List<Mods> ModsKeys;
    @Order(6)
    private List<MonsterVarieties> MapBoss_MonsterVarietiesKeys;

}
