
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
public class MonsterVarieties
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private MonsterTypes MonsterTypesKey;
    @Order(2)
    private int Unknown3;
    @Order(3)
    private int ObjectSize;
    @Order(4)
    private int MinimumAttackDistance;
    @Order(5)
    private int MaximumAttackDistance;
    @Order(6)
    private String ActorIndex;
    @Order(7)
    private String AnimatedObjectIndex;
    @Order(8)
    private String BaseMonsterTypeIndex;
    @Order(9)
    private List<Mods> ModsKeys;
    @Order(10)
    private int Unknown12;
    @Order(11)
    private String UnknownIndex0;
    @Order(12)
    private String UnknownIndex1;
    @Order(13)
    private int Unknown81;
    @Order(14)
    private int Unknown82;
    @Order(15)
    private int Unknown83;
    @Order(16)
    private int Unknown84;
    @Order(17)
    private int Unknown85;
    @Order(18)
    private int Unknown86;
    @Order(19)
    private List<Tags> TagsKeys;
    @Order(20)
    private int Unknown17;
    @Order(21)
    private List<Integer> Unknown18;
    @Order(22)
    private int Unknown20;
    @Order(23)
    private int Unknown21;
    @Order(24)
    private int Unknown22;
    @Order(25)
    private int CriticalStrikeChance;
    @Order(26)
    private int Unknown20b;
    @Order(27)
    private List<GrantedEffects> GrantedEffectsKeys;
    @Order(28)
    private String AIIndex;
    @Order(29)
    private List<Mods> ModsKeys2;
    @Order(30)
    private String Unknown38;
    @Order(31)
    private Long Key2;
    @Order(32)
    private String Name;
    @Order(33)
    private int DamageMultiplier;
    @Order(34)
    private int LifeMultiplier;
    @Order(35)
    private int AttackSpeed;
    @Order(36)
    private List<ItemVisualIdentity> Weapon1_ItemVisualIdentityKeys;
    @Order(37)
    private List<ItemVisualIdentity> Weapon2_ItemVisualIdentityKeys;
    @Order(38)
    private ItemVisualIdentity Back_ItemVisualIdentityKey;
    @Order(39)
    private int Unknown72;
    @Order(40)
    private int Unknown73;
    @Order(41)
    private Long Key1;
    @Order(42)
    private Stats StatsKey;
    @Order(43)
    private int Unknown57;
    @Order(44)
    private int Unknown76;
    @Order(45)
    private int Unknown77;
    @Order(46)
    private List<AchievementItems> AchievementItemsKeys;
    @Order(47)
    private List<Long> Special_ModsKeys;
    @Order(48)
    private AchievementItems AchievementItemsKey;
    @Order(49)
    private Boolean Unknown63;
    @Order(50)
    private int Unknown64;
    @Order(51)
    private int Unknown65;
    @Order(52)
    private int Unknown66;
    @Order(53)
    private int Unknown67;
    @Order(54)
    private int Unknown68;
    @Order(55)
    private int Unknown69;
    @Order(56)
    private int Unknown74;
    @Order(57)
    private Byte Unknown70;
    @Order(58)
    private String Unknown75;
    @Order(59)
    private Long Key4;
    @Order(60)
    private AchievementItems Normal_AchievementItemsKey;
    @Order(61)
    private AchievementItems Merciless_AchievementItemsKey;
    @Order(62)
    private AchievementItems Cruel_AchievementItemsKey;
    @Order(63)
    private Long Key8;
    @Order(64)
    private Long Key9;
    @Order(65)
    private AchievementItems AchievementItemsKey2;
    @Order(66)
    private AchievementItems AchievementItemsKey3;

}
