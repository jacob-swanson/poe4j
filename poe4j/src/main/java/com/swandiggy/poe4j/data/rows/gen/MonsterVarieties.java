
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterVarieties")
public class MonsterVarieties
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private MonsterType monsterTypesKey;
    @Order(2)
    private Integer unknown0;
    @Order(3)
    private Integer objectSize;
    @Order(4)
    private Integer minimumAttackDistance;
    @Order(5)
    private Integer maximumAttackDistance;
    @Order(6)
    private String aCTFile;
    @Order(7)
    private String aOFile;
    @Order(8)
    private String baseMonsterTypeIndex;
    @Order(9)
    private List<Mods> modsKeys;
    @Order(10)
    private Integer unknown1;
    @Order(11)
    private String unknownIndex0;
    @Order(12)
    private String unknownIndex1;
    @Order(13)
    private Integer modelSizeMultiplier;
    @Order(14)
    private Integer unknown2;
    @Order(15)
    private Integer unknown3;
    @Order(16)
    private Integer unknown4;
    @Order(17)
    private Integer unknown5;
    @Order(18)
    private Integer unknown6;
    @Order(19)
    private List<Tags> tagsKeys;
    @Order(20)
    private Integer experienceMultiplier;
    @Order(21)
    private List<Integer> unknown7;
    @Order(22)
    private Integer unknown8;
    @Order(23)
    private Integer unknown9;
    @Order(24)
    private Integer unknown10;
    @Order(25)
    private Integer criticalStrikeChance;
    @Order(26)
    private Integer unknown11;
    @Order(27)
    private List<GrantedEffect> grantedEffectsKeys;
    @Order(28)
    private String aISFile;
    @Order(29)
    private List<Mods> modsKeys2;
    @Order(30)
    private String stance;
    @Order(31)
    private Long key2;
    @Order(32)
    private String name;
    @Order(33)
    private Integer damageMultiplier;
    @Order(34)
    private Integer lifeMultiplier;
    @Order(35)
    private Integer attackSpeed;
    @Order(36)
    private List<ItemVisualIdentity> weapon1_ItemVisualIdentityKeys;
    @Order(37)
    private List<ItemVisualIdentity> weapon2_ItemVisualIdentityKeys;
    @Order(38)
    private ItemVisualIdentity back_ItemVisualIdentityKey;
    @Order(39)
    private ItemClasses mainHand_ItemClassesKey;
    @Order(40)
    private ItemClasses offHand_ItemClassesKey;
    @Order(41)
    private Long key1;
    @Order(42)
    private ItemVisualIdentity helmet_ItemVisualIdentityKey;
    @Order(43)
    private Integer unknown13;
    @Order(44)
    private List<AchievementItem> achievementItemsKeys;
    @Order(45)
    private List<Mods> special_ModsKeys;
    @Order(46)
    private List<AchievementItem> achievementItemsKeys2;
    @Order(47)
    private Boolean unknown14;
    @Order(48)
    private Integer unknown15;
    @Order(49)
    private Integer unknown16;
    @Order(50)
    private Integer unknown17;
    @Order(51)
    private Integer unknown18;
    @Order(52)
    private Integer unknown19;
    @Order(53)
    private Integer unknown20;
    @Order(54)
    private Integer unknown21;
    @Order(55)
    private Byte unknown22;
    @Order(56)
    private String unknown23;
    @Order(57)
    private List<AchievementItem> normal_AchievementItemsKeys;
    @Order(58)
    private List<AchievementItem> merciless_AchievementItemsKeys;
    @Order(59)
    private List<AchievementItem> cruel_AchievementItemsKeys;
    @Order(60)
    private AchievementItem flashback_AchievementItemsKey;
    @Order(61)
    private MonsterSegment monsterSegmentsKey;
    @Order(62)
    private MonsterArmour monsterArmoursKey;
    @Order(63)
    private AchievementItem achievementItemsKey;
    @Order(64)
    private List<AchievementItem> achievementItemsKey4;
    @Order(65)
    private List<Mods> normal_ModsKeys;
    @Order(66)
    private List<Mods> cruel_ModsKeys;
    @Order(67)
    private List<Mods> merciless_ModsKeys;
    @Order(68)
    private List<AchievementItem> killRareInNormal_AchievementItemsKeys;
    @Order(69)
    private List<AchievementItem> killRareInCruel_AchievementItemsKeys;
    @Order(70)
    private List<AchievementItem> killRareInMerciless_AchievementItemsKeys;
    @Order(71)
    private Long key3;
    @Order(72)
    private List<AchievementItem> countKills_AchievementItemsKeys;

}
