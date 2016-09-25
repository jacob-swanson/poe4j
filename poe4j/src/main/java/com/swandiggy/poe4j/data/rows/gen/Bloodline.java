
package com.swandiggy.poe4j.data.rows.gen;

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
    private List<Mods> modsKeys;
    @Order(2)
    private Integer minZoneLevel;
    @Order(3)
    private Integer maxZoneLevel;
    @Order(4)
    private List<Tags> spawnWeight_TagsKeys;
    @Order(5)
    private List<Integer> spawnWeight_Values;
    @Order(6)
    private Integer unknown8;
    @Order(7)
    private BuffDefinitions buffDefinitionsKey;
    @Order(8)
    private List<Integer> unknown11;
    @Order(9)
    private List<Tags> itemWeight_TagsKeys;
    @Order(10)
    private List<Integer> itemWeight_Values;
    @Order(11)
    private MonsterVarieties monsterVarietiesKey;
    @Order(12)
    private Integer unknown20;
    @Order(13)
    private Boolean flag0;
    @Order(14)
    private List<Long> keys2;
    @Order(15)
    private Boolean flag1;

}
