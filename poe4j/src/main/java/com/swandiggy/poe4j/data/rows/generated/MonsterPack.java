
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterPacks")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class MonsterPack
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private WorldArea worldArea;
    @Order(2)
    private int unknown3;
    @Order(3)
    private int unknown4;
    @Order(4)
    private int unknown5;
    @Order(5)
    private int bossMonsterSpawnChance;
    @Order(6)
    private int bossMonsterCount;
    @Order(7)
    private List<MonsterVariety> bossMonsterMonsterVarieties;
    @Order(8)
    private Boolean flag0;
    @Order(9)
    private int unknown11;
    @Order(10)
    private List<String> data1;
    @Order(11)
    private List<Tags> tags;

}
