
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterPacks")
public class MonsterPacks
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<WorldAreas> worldAreasKeys;
    @Order(2)
    private Integer unknown3;
    @Order(3)
    private Integer unknown4;
    @Order(4)
    private Integer unknown5;
    @Order(5)
    private Integer bossMonsterSpawnChance;
    @Order(6)
    private Integer bossMonsterCount;
    @Order(7)
    private List<MonsterVarieties> bossMonster_MonsterVarietiesKeys;
    @Order(8)
    private Boolean flag0;
    @Order(9)
    private Integer unknown11;
    @Order(10)
    private List<String> data1;
    @Order(11)
    private List<Tags> tagsKeys;

}
