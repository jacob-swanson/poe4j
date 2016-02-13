
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
public class DexMissionMonsters
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private List<MonsterPacks> MonsterPacksKeys;
    @Order(2)
    private int SpawnWeight;
    @Order(3)
    private int MinLevel;
    @Order(4)
    private int MaxLevel;
    @Order(5)
    private List<MonsterVarieties> MonsterVarietiesKeys;

}
