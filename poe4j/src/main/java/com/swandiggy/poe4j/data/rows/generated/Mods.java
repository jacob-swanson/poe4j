
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
public class Mods
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int Unknown0;
    @Order(2)
    private ModType ModTypeKey;
    @Order(3)
    private int Level;
    @Order(4)
    private Stats StatsKey1;
    @Order(5)
    private Stats StatsKey2;
    @Order(6)
    private Stats StatsKey3;
    @Order(7)
    private Stats StatsKey4;
    @Order(8)
    private int Domain;
    @Order(9)
    private String Name;
    @Order(10)
    private int GenerationType;
    @Order(11)
    private String CorrectGroup;
    @Order(12)
    private int Stat1Min;
    @Order(13)
    private int Stat1Max;
    @Order(14)
    private int Stat2Min;
    @Order(15)
    private int Stat2Max;
    @Order(16)
    private int Stat3Min;
    @Order(17)
    private int Stat3Max;
    @Order(18)
    private int Stat4Min;
    @Order(19)
    private int Stat4Max;
    @Order(20)
    private List<Tags> SpawnWeight_TagsKeys;
    @Order(21)
    private List<Integer> SpawnWeight_Values;
    @Order(22)
    private BuffDefinitions BuffDefinitionsKey;
    @Order(23)
    private int BuffValue;
    @Order(24)
    private List<Tags> TagsKeys;
    @Order(25)
    private GrantedEffectsPerLevel GrantedEffectsPerLevelKey;
    @Order(26)
    private List<Integer> Data1;
    @Order(27)
    private List<Integer> Data2;
    @Order(28)
    private String MonsterMetadata;
    @Order(29)
    private List<Integer> Data3;
    @Order(30)
    private List<Integer> Data4;
    @Order(31)
    private Long Key0;
    @Order(32)
    private int Stat5Min;
    @Order(33)
    private int Stat5Max;
    @Order(34)
    private Stats StatsKey5;
    @Order(35)
    private List<Long> Keys0;

}
