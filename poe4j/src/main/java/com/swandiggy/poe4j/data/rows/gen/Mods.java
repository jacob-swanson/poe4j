
package com.swandiggy.poe4j.data.rows.gen;

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
    private Integer unknown0;
    @Order(2)
    private ModType modTypeKey;
    @Order(3)
    private Integer level;
    @Order(4)
    private Stats statsKey1;
    @Order(5)
    private Stats statsKey2;
    @Order(6)
    private Stats statsKey3;
    @Order(7)
    private Stats statsKey4;
    @Order(8)
    private Integer domain;
    @Order(9)
    private String name;
    @Order(10)
    private Integer generationType;
    @Order(11)
    private String correctGroup;
    @Order(12)
    private Integer stat1Min;
    @Order(13)
    private Integer stat1Max;
    @Order(14)
    private Integer stat2Min;
    @Order(15)
    private Integer stat2Max;
    @Order(16)
    private Integer stat3Min;
    @Order(17)
    private Integer stat3Max;
    @Order(18)
    private Integer stat4Min;
    @Order(19)
    private Integer stat4Max;
    @Order(20)
    private List<Tags> spawnWeight_TagsKeys;
    @Order(21)
    private List<Integer> spawnWeight_Values;
    @Order(22)
    private BuffDefinitions buffDefinitionsKey;
    @Order(23)
    private Integer buffValue;
    @Order(24)
    private List<Tags> tagsKeys;
    @Order(25)
    private GrantedEffectsPerLevel grantedEffectsPerLevelKey;
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
    private Integer stat5Min;
    @Order(33)
    private Integer stat5Max;
    @Order(34)
    private Stats statsKey5;
    @Order(35)
    private List<Long> keys0;
    @Order(36)
    private AchievementItem achievementItemsKey;
    @Order(37)
    private List<Tags> generationWeight_TagsKeys;
    @Order(38)
    private List<Integer> generationWeight_Values;
    @Order(39)
    private List<Integer> data5;

}
