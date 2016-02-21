
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterVarieties")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class MonsterVariety
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private MonsterType monsterType;
    @Order(2)
    private int unknown3;
    @Order(3)
    private int objectSize;
    @Order(4)
    private int minimumAttackDistance;
    @Order(5)
    private int maximumAttackDistance;
    @Order(6)
    private String actorIndex;
    @Order(7)
    private String animatedObjectIndex;
    @Order(8)
    private String baseMonsterTypeIndex;
    @Order(9)
    private List<Mods> mods;
    @Order(10)
    private int unknown12;
    @Order(11)
    private String unknownIndex0;
    @Order(12)
    private String unknownIndex1;
    @Order(13)
    private int unknown81;
    @Order(14)
    private int unknown82;
    @Order(15)
    private int unknown83;
    @Order(16)
    private int unknown84;
    @Order(17)
    private int unknown85;
    @Order(18)
    private int unknown86;
    @Order(19)
    private List<Tags> tags;
    @Order(20)
    private int unknown17;
    @Order(21)
    private List<Integer> unknown18;
    @Order(22)
    private int unknown20;
    @Order(23)
    private int unknown21;
    @Order(24)
    private int unknown22;
    @Order(25)
    private int criticalStrikeChance;
    @Order(26)
    private int unknown20b;
    @Order(27)
    private List<GrantedEffect> grantedEffects;
    @Order(28)
    private String aIIndex;
    @Order(29)
    private List<Mods> modsKeys2;
    @Order(30)
    private String unknown38;
    @Order(31)
    private Long key2;
    @Order(32)
    private String name;
    @Order(33)
    private int damageMultiplier;
    @Order(34)
    private int lifeMultiplier;
    @Order(35)
    private int attackSpeed;
    @Order(36)
    private List<ItemVisualIdentity> weapon1ItemVisualIdentity;
    @Order(37)
    private List<ItemVisualIdentity> weapon2ItemVisualIdentity;
    @Order(38)
    private ItemVisualIdentity backItemVisualIdentity;
    @Order(39)
    private int unknown72;
    @Order(40)
    private int unknown73;
    @Order(41)
    private Long key1;
    @Order(42)
    private Stats stat;
    @Order(43)
    private int unknown57;
    @Order(44)
    private int unknown76;
    @Order(45)
    private int unknown77;
    @Order(46)
    private List<AchievementItem> achievementItems;
    @Order(47)
    private List<Long> specialMods;
    @Order(48)
    private AchievementItem achievementItem;
    @Order(49)
    private Boolean unknown63;
    @Order(50)
    private int unknown64;
    @Order(51)
    private int unknown65;
    @Order(52)
    private int unknown66;
    @Order(53)
    private int unknown67;
    @Order(54)
    private int unknown68;
    @Order(55)
    private int unknown69;
    @Order(56)
    private int unknown74;
    @Order(57)
    private Byte unknown70;
    @Order(58)
    private String unknown75;
    @Order(59)
    private Long key4;
    @Order(60)
    private AchievementItem normalAchievementItem;
    @Order(61)
    private AchievementItem mercilessAchievementItem;
    @Order(62)
    private AchievementItem cruelAchievementItem;
    @Order(63)
    private Long key8;
    @Order(64)
    private Long key9;
    @Order(65)
    private AchievementItem achievementItemsKey2;
    @Order(66)
    private AchievementItem achievementItemsKey3;

}
