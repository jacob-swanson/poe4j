
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
public class MonsterPacks
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private WorldAreas WorldAreasKey;
    @Order(2)
    private int Unknown3;
    @Order(3)
    private int Unknown4;
    @Order(4)
    private int Unknown5;
    @Order(5)
    private int BossMonsterSpawnChance;
    @Order(6)
    private int BossMonsterCount;
    @Order(7)
    private List<MonsterVarieties> BossMonster_MonsterVarietiesKeys;
    @Order(8)
    private Boolean Flag0;
    @Order(9)
    private int Unknown11;
    @Order(10)
    private List<String> Data1;
    @Order(11)
    private List<Tags> TagsKeys;

}
