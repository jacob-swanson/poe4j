
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Bloodlines")
public class Bloodline
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Mods> mods;
    @Order(2)
    private int minZoneLevel;
    @Order(3)
    private int maxZoneLevel;
    @Order(4)
    private List<Tags> spawnWeightTags;
    @Order(5)
    private List<Integer> spawnWeightValues;
    @Order(6)
    private int unknown8;
    @Order(7)
    private BuffDefinition buffDefinition;
    @Order(8)
    private List<Integer> unknown11;
    @Order(9)
    private List<Tags> itemWeightTags;
    @Order(10)
    private List<Integer> itemWeightValues;
    @Order(11)
    private MonsterVariety monsterVariety;
    @Order(12)
    private int unknown20;
    @Order(13)
    private Boolean flag0;
    @Order(14)
    private List<Long> keys2;
    @Order(15)
    private Boolean flag1;

}
