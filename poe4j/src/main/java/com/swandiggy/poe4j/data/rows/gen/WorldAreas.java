
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("WorldAreas")
public class WorldAreas
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private Integer act;
    @Order(3)
    private Boolean isTown;
    @Order(4)
    private Boolean hasWaypoint;
    @Order(5)
    private List<WorldAreas> connections_WorldAreasKeys;
    @Order(6)
    private Integer monsterLevel;
    @Order(7)
    private Boolean hasDoodads;
    @Order(8)
    private Integer unknown6;
    @Order(9)
    private Integer unknown7;
    @Order(10)
    private Integer unknown8;
    @Order(11)
    private Integer unknown9;
    @Order(12)
    private String loadingScreen_DDSFile;
    @Order(13)
    private Integer unknown11;
    @Order(14)
    private List<Integer> data1;
    @Order(15)
    private Integer unknown15;
    @Order(16)
    private List<Topologie> topologiesKeys;
    @Order(17)
    private WorldAreas parentTown_WorldAreasKey;
    @Order(18)
    private Difficulties difficultiesKey;
    @Order(19)
    private Integer unknown21;
    @Order(20)
    private Integer unknown22;
    @Order(21)
    private Integer unknown23;
    @Order(22)
    private List<MonsterVarieties> bosses_MonsterVarietiesKeys;
    @Order(23)
    private List<MonsterVarieties> monsters_MonsterVarietiesKey;
    @Order(24)
    private List<Tags> spawnWeight_TagsKeys;
    @Order(25)
    private List<Integer> spawnWeight_Values;
    @Order(26)
    private Boolean isMap;
    @Order(27)
    private List<AchievementItem> fullClear_AchievementItemsKeys;
    @Order(28)
    private Integer unknown32;
    @Order(29)
    private Integer unknown33;
    @Order(30)
    private AchievementItem achievementItemsKey;
    @Order(31)
    private List<Mods> modsKeys;
    @Order(32)
    private Integer unknown39;
    @Order(33)
    private Integer unknown40;
    @Order(34)
    private List<Integer> data9;
    @Order(35)
    private Integer temp;
    @Order(36)
    private Integer unknown43;
    @Order(37)
    private Integer unknown44;
    @Order(38)
    private List<Integer> data10;
    @Order(39)
    private Boolean isTownArea;
    @Order(40)
    private Integer unknown49;
    @Order(41)
    private Integer maxLevel;
    @Order(42)
    private List<Tags> tagsKeys;
    @Order(43)
    private Integer unknown50;
    @Order(44)
    private Boolean isMercilessVaalArea;
    @Order(45)
    private Integer unknown52;
    @Order(46)
    private Boolean isHideout;
    @Order(47)
    private Integer unknown53;
    @Order(48)
    private Integer unknown54;
    @Order(49)
    private Integer unknown55;
    @Order(50)
    private Integer unknown56;
    @Order(51)
    private String unknownIndex;
    @Order(52)
    private Integer unknown59;
    @Order(53)
    private Integer unknown60;
    @Order(54)
    private Integer unknown61;
    @Order(55)
    private List<Tags> tagsKeys2;
    @Order(56)
    private Boolean isVaalArea;
    @Order(57)
    private Integer unknown64;
    @Order(58)
    private Integer unknown65;
    @Order(59)
    private Integer unknown66;
    @Order(60)
    private Boolean isLabyrinthAirlock;
    @Order(61)
    private Boolean isLabyrinthArea;
    @Order(62)
    private AchievementItem twinnedFullClear_AchievementItemsKey;
    @Order(63)
    private AchievementItem enter_AchievementItemsKey;
    @Order(64)
    private Integer unknown73;
    @Order(65)
    private Integer unknown74;
    @Order(66)
    private Integer unknown75;
    @Order(67)
    private String unknown76;
    @Order(68)
    private AchievementItem eightModsFullClear_AchievementItemsKey;
    @Order(69)
    private Integer unknown77;
    @Order(70)
    private Integer unknown78;
    @Order(71)
    private Integer unknown79;
    @Order(72)
    private List<AchievementItem> keys1;
    @Order(73)
    private Boolean flag0;
    @Order(74)
    private Boolean flag1;
    @Order(75)
    private Integer unknown82;
    @Order(76)
    private Integer unknown83;
    @Order(77)
    private List<Long> keys2;
    @Order(78)
    private Long key0a;
    @Order(79)
    private Long key0b;
    @Order(80)
    private String unknown88;

}
