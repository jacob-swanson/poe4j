
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("WorldAreas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class WorldArea
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private int act;
    @Order(3)
    private Boolean isTown;
    @Order(4)
    private Boolean hasWaypoint;
    @Order(5)
    @Reference(Integer.class)
    private List<WorldArea> connections;
    @Order(6)
    private int monsterLevel;
    @Order(7)
    private Boolean hasDoodad;
    @Order(8)
    private Byte unknown5;
    @Order(9)
    private Byte unknown5a;
    @Order(10)
    private Byte unknown5b;
    @Order(11)
    private Boolean flag0;
    @Order(12)
    private int unknownId;
    @Order(13)
    private int unknown7;
    @Order(14)
    private int unknown8;
    @Order(15)
    private String loadingScreen;
    @Order(16)
    private int unknown10;
    @Order(17)
    private List<Integer> data1;
    @Order(18)
    private int unknown13;
    @Order(19)
    private List<Topology> topologies;
    @Order(20)
    @Reference(Integer.class)
    private WorldArea parentTownWorldArea;
    @Order(21)
    private Difficulty difficulty;
    @Order(22)
    private int unknown19;
    @Order(23)
    private int unknown20;
    @Order(24)
    private int unknown21;
    @Order(25)
    private int unknown22;
    @Order(26)
    private List<MonsterVariety> bossesMonsterVarieties;
    @Order(27)
    private List<MonsterVariety> monstersMonsterVariety;
    @Order(28)
    private List<Tags> spawnWeightTags;
    @Order(29)
    private List<Integer> spawnWeightValues;
    @Order(30)
    private Boolean isMap;
    @Order(31)
    private List<Long> keys0;
    @Order(32)
    private int unknown32;
    @Order(33)
    private int unknown33;
    @Order(34)
    private AchievementItem achievementItem;
    @Order(35)
    private List<Mods> mods;
    @Order(36)
    private String mapSound;
    @Order(37)
    private int unknown38;
    @Order(38)
    private int unknown39;
    @Order(39)
    private List<Integer> data9;
    @Order(40)
    private int temp;
    @Order(41)
    private int unknown43;
    @Order(42)
    private int unknown44;
    @Order(43)
    private List<Integer> data10;
    @Order(44)
    private Boolean isTownArea;
    @Order(45)
    private int unknown49;
    @Order(46)
    private int maxLevel;
    @Order(47)
    private List<Tags> tags;
    @Order(48)
    private int unknown50;
    @Order(49)
    private Boolean isMercilessVaalArea;
    @Order(50)
    private int unknown52;
    @Order(51)
    private Boolean isHideout;
    @Order(52)
    private int unknown53;
    @Order(53)
    private int unknown54;
    @Order(54)
    private int unknown55;
    @Order(55)
    private int unknown56;
    @Order(56)
    private String unknownIndex;
    @Order(57)
    private Byte unknown58;
    @Order(58)
    private int unknown59;
    @Order(59)
    private int unknown60;
    @Order(60)
    private int unknown61;
    @Order(61)
    private int variableReferenceType;
    @Order(62)
    private String variableReference;
    @Order(63)
    private Byte unknown63;
    @Order(64)
    private int unknown64;
    @Order(65)
    private int unknown65;
    @Order(66)
    private int unknown66;
    @Order(67)
    private Short unknown71;
    @Order(68)
    private Long unknown67;
    @Order(69)
    private Long unknown69;

}
