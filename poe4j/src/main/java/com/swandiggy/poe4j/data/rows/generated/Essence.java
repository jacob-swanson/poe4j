
package com.swandiggy.poe4j.data.rows.generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Essences")
public class Essence
    extends BaseRow
{

    @Order(0)
    private BaseItemType baseItemType;
    @Order(1)
    private Long unknown1;
    @Order(2)
    private Long unknown2;
    @Order(3)
    private Long unknown3;
    @Order(4)
    private Long unknown4
    @Order(5)
    private Long unknown5
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
    private Mod mod1;
    @Order(13)
    private Mod mod2;
    @Order(14)
    private Mod quiverMod;
    @Order(15)
    private Mod amuletMod;
    @Order(16)
    private Mod beltMod1;
    @Order(17)
    private Mod beltMod2;
    @Order(18)
    private Mod gloveMod;
    @Order(19)
    private Mod bootMod;
    @Order(20)
    private Mod bodyMod;
    @Order(21)
    private Mod helmetMod;
    @Order(22)
    private Mod shieldMod;
    @Order(23)
    private Integer unknown23;
    @Order(24)
    private Integer minDropLevel;
    @Order(25)
    private Integer maxDropLevel;
    @Order(26)
    private List<Mod> monsterMods;
    @Order(27)
    private EssenceType essence;
    @Order(28)
    private Integer tier;
    @Order(29)
    private Integer unknown31;
    @Order(30)
    private Mod oneHandMod;
    @Order(31)
    private Mod modKey13;
    @Order(32)
    private Mod modKey14;
    @Order(33)
    private Mod modKey15;
    @Order(34)
    private Mod twoHandMod;
    @Order(35)
    private Mod bootMod;
    @Order(36)
    private Mod rangedMod;
    @Order(37)
    private Mod helmetMod;
    @Order(38)
    private Mod bodyArmourMod;
    @Order(39)
    private Mod bootMod;
    @Order(40)
    private Mod goveMod;
    @Order(41)
    private Mod bowMod;
    @Order(42)
    private Mod wandMod;
    @Order(43)
    private Mod twoHandMod;
    @Order(44)
    private Mod twoHandMod;
    @Order(45)
    private Mod twoHandMod;
    @Order(46)
    private Mod twoHandMod;
    @Order(47)
    private Mod oneHandMod;
    @Order(48)
    private Mod oneHandMod;
    @Order(49)
    private Mod oneHandMod;
    @Order(50)
    private Mod oneHandMod;
    @Order(51)
    private Mod oneHandMod;
    @Order(52)
    private Mod oneHandMod;
    @Order(53)
    private Mod oneHandMod;
    @Order(54)
    private Mod oneHandMod;
    @Order(55)
    private Integer itemLevelRestriction;
    @Order(56)
    private ClientString clientString;
    @Order(57)
    private Mod beltMod;
    @Order(58)
    private Mod amuletMod;
    @Order(59)
    private Mod ringMod;
    @Order(60)
    private Mod mod41;
    @Order(61)
    private Mod shieldMod;
    @Order(62)
    private Mod mod43;
    @Order(63)
    private Boolean isScreamingEssence;
    
}
