
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Mods")
public class Mods
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int unknown0;
    @Order(2)
    private ModType modType;
    @Order(3)
    private int level;
    @Order(4)
    private Stats statsKey1;
    @Order(5)
    private Stats statsKey2;
    @Order(6)
    private Stats statsKey3;
    @Order(7)
    private Stats statsKey4;
    @Order(8)
    private int domain;
    @Order(9)
    private String name;
    @Order(10)
    private int generationType;
    @Order(11)
    private String correctGroup;
    @Order(12)
    private int stat1Min;
    @Order(13)
    private int stat1Max;
    @Order(14)
    private int stat2Min;
    @Order(15)
    private int stat2Max;
    @Order(16)
    private int stat3Min;
    @Order(17)
    private int stat3Max;
    @Order(18)
    private int stat4Min;
    @Order(19)
    private int stat4Max;
    @Order(20)
    private List<Tags> spawnWeightTags;
    @Order(21)
    private List<Integer> spawnWeightValues;
    @Order(22)
    private BuffDefinition buffDefinition;
    @Order(23)
    private int buffValue;
    @Order(24)
    private List<Tags> tags;
    @Order(25)
    private GrantedEffectsPerLevel grantedEffectsPerLevel;
    @Order(26)
    private List<Integer> data1;
    @Order(27)
    private List<Integer> data2;
    @Order(28)
    private String monsterMetadata;
    @Order(29)
    private List<Integer> data3;
    @Order(30)
    private List<Integer> data4;
    @Order(31)
    private Long key0;
    @Order(32)
    private int stat5Min;
    @Order(33)
    private int stat5Max;
    @Order(34)
    private Stats statsKey5;
    @Order(35)
    private List<Long> keys0;

}
