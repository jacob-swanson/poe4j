
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
public class StrIntMissionMonsterWaves
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private MonsterPacks MonsterPacksKey;
    @Order(2)
    private int WaveCount;
    @Order(3)
    private int SpawnWeight;
    @Order(4)
    private int MinLevel;
    @Order(5)
    private int MaxLevel;
    @Order(6)
    private int PackTimer;
    @Order(7)
    private int TimeLimit;
    @Order(8)
    private List<MonsterVarieties> Unique_MonsterVarietiesKeys;
    @Order(9)
    private Long Key0;
    @Order(10)
    private List<Integer> Unknown13;
    @Order(11)
    private int UniqueCount;

}
