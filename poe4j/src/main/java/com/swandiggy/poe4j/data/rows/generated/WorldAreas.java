
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class WorldAreas
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Name;
    @Order(2)
    private int Act;
    @Order(3)
    private Boolean IsTown;
    @Order(4)
    private Boolean HasWaypoint;
    @Order(5)
    @Reference(Integer.class)
    private List<WorldAreas> Connections_WorldAreasKeys;
    @Order(6)
    private int MonsterLevel;
    @Order(7)
    private Boolean HasDoodads;
    @Order(8)
    private Byte Unknown5;
    @Order(9)
    private Byte Unknown5a;
    @Order(10)
    private Byte Unknown5b;
    @Order(11)
    private Boolean Flag0;
    @Order(12)
    private int UnknownId;
    @Order(13)
    private int Unknown7;
    @Order(14)
    private int Unknown8;
    @Order(15)
    private String LoadingScreen;
    @Order(16)
    private int Unknown10;
    @Order(17)
    private List<Integer> Data1;
    @Order(18)
    private int Unknown13;
    @Order(19)
    private List<Topologies> TopologiesKeys;
    @Order(20)
    @Reference(Integer.class)
    private WorldAreas ParentTown_WorldAreasKey;
    @Order(21)
    private Difficulties DifficultiesKey;
    @Order(22)
    private int Unknown19;
    @Order(23)
    private int Unknown20;
    @Order(24)
    private int Unknown21;
    @Order(25)
    private int Unknown22;
    @Order(26)
    private List<MonsterVarieties> Bosses_MonsterVarietiesKeys;
    @Order(27)
    private List<MonsterVarieties> Monsters_MonsterVarietiesKey;
    @Order(28)
    private List<Tags> SpawnWeight_TagsKeys;
    @Order(29)
    private List<Integer> SpawnWeight_Values;
    @Order(30)
    private Boolean IsMap;
    @Order(31)
    private List<Long> Keys0;
    @Order(32)
    private int Unknown32;
    @Order(33)
    private int Unknown33;
    @Order(34)
    private AchievementItems AchievementItemsKey;
    @Order(35)
    private List<Mods> ModsKeys;
    @Order(36)
    private String MapSound;
    @Order(37)
    private int Unknown38;
    @Order(38)
    private int Unknown39;
    @Order(39)
    private List<Integer> Data9;
    @Order(40)
    private int Temp;
    @Order(41)
    private int Unknown43;
    @Order(42)
    private int Unknown44;
    @Order(43)
    private List<Integer> Data10;
    @Order(44)
    private Boolean IsTownArea;
    @Order(45)
    private int Unknown49;
    @Order(46)
    private int MaxLevel;
    @Order(47)
    private List<Tags> TagsKeys;
    @Order(48)
    private int Unknown50;
    @Order(49)
    private Boolean IsMercilessVaalArea;
    @Order(50)
    private int Unknown52;
    @Order(51)
    private Boolean IsHideout;
    @Order(52)
    private int Unknown53;
    @Order(53)
    private int Unknown54;
    @Order(54)
    private int Unknown55;
    @Order(55)
    private int Unknown56;
    @Order(56)
    private String UnknownIndex;
    @Order(57)
    private Byte Unknown58;
    @Order(58)
    private int Unknown59;
    @Order(59)
    private int Unknown60;
    @Order(60)
    private int Unknown61;
    @Order(61)
    private int VariableReferenceType;
    @Order(62)
    private String VariableReference;
    @Order(63)
    private Byte Unknown63;
    @Order(64)
    private int Unknown64;
    @Order(65)
    private int Unknown65;
    @Order(66)
    private int Unknown66;
    @Order(67)
    private Short Unknown71;
    @Order(68)
    private Long Unknown67;
    @Order(69)
    private Long Unknown69;

}
