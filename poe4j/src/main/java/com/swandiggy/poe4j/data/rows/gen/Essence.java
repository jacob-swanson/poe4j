
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Essences")
public class Essence
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private Long unknown1;
    @Order(2)
    private Long unknown2;
    @Order(3)
    private Long unknown3;
    @Order(4)
    private Long unknown4;
    @Order(5)
    private Long unknown5;
    @Order(6)
    private Long unknown6;
    @Order(7)
    private Long unknown7;
    @Order(8)
    private Long unknown8;
    @Order(9)
    private Long unknown9;
    @Order(10)
    private Long unknown10;
    @Order(11)
    private Long unknown11;
    @Order(12)
    private Mods modsKey1;
    @Order(13)
    private Mods modsKey2;
    @Order(14)
    private Mods quiver_ModsKey;
    @Order(15)
    private Mods amulet1_ModsKey;
    @Order(16)
    private Mods belt1_ModsKey;
    @Order(17)
    private Mods belt3_ModsKey;
    @Order(18)
    private Mods gloves1_ModsKey;
    @Order(19)
    private Mods boots1_ModsKey;
    @Order(20)
    private Mods bodyArmour1_ModsKey;
    @Order(21)
    private Mods helmet1_ModsKey;
    @Order(22)
    private Mods shield1_ModsKey;
    @Order(23)
    private Integer unknown23;
    @Order(24)
    private Integer dropLevelMinimum;
    @Order(25)
    private Integer dropLevelMaximum;
    @Order(26)
    private List<Mods> monster_ModsKeys;
    @Order(27)
    private EssenceType essenceTypeKey;
    @Order(28)
    private Integer tier;
    @Order(29)
    private Integer unknown31;
    @Order(30)
    private Mods oneHand_ModsKey1;
    @Order(31)
    private Mods modsKey13;
    @Order(32)
    private Mods modsKey14;
    @Order(33)
    private Mods modsKey15;
    @Order(34)
    private Mods twoHand_ModsKey1;
    @Order(35)
    private Mods boots3_ModsKey;
    @Order(36)
    private Mods ranged_ModsKey;
    @Order(37)
    private Mods helmet2_ModsKey;
    @Order(38)
    private Mods bodyArmour2_ModsKey;
    @Order(39)
    private Mods boots2_ModsKey;
    @Order(40)
    private Mods gloves2_ModsKey;
    @Order(41)
    private Mods bow_ModsKey;
    @Order(42)
    private Mods wand_ModsKey;
    @Order(43)
    private Mods twoHand_ModsKey2;
    @Order(44)
    private Mods twoHand_ModsKey3;
    @Order(45)
    private Mods twoHand_ModsKey4;
    @Order(46)
    private Mods twoHand_ModsKey5;
    @Order(47)
    private Mods oneHand_ModsKey2;
    @Order(48)
    private Mods oneHand_ModsKey3;
    @Order(49)
    private Mods oneHand_ModsKey4;
    @Order(50)
    private Mods oneHand_ModsKey5;
    @Order(51)
    private Mods oneHand_ModsKey6;
    @Order(52)
    private Mods oneHand_ModsKey7;
    @Order(53)
    private Mods oneHand_ModsKey8;
    @Order(54)
    private Mods oneHand_ModsKey9;
    @Order(55)
    private Integer itemLevelRestriction;
    @Order(56)
    private ClientString clientStringsKey;
    @Order(57)
    private Mods belt2_ModsKey;
    @Order(58)
    private Mods amulet2_ModsKey;
    @Order(59)
    private Mods ring_ModsKey;
    @Order(60)
    private Mods modsKey41;
    @Order(61)
    private Mods shield2_ModsKey;
    @Order(62)
    private Mods modsKey43;
    @Order(63)
    private Boolean isScreamingEssence;

}
