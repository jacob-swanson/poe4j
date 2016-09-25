
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("GrantedEffectsPerLevel")
public class GrantedEffectsPerLevel
    extends BaseRow
{

    @Order(0)
    private GrantedEffect grantedEffectsKey;
    @Order(1)
    private Integer level;
    @Order(2)
    private List<Stats> statsKeys;
    @Order(3)
    private Integer stat1Value;
    @Order(4)
    private Integer stat2Value;
    @Order(5)
    private Integer stat3Value;
    @Order(6)
    private Integer stat4Value;
    @Order(7)
    private Integer stat5Value;
    @Order(8)
    private Integer stat6Value;
    @Order(9)
    private Integer stat7Value;
    @Order(10)
    private Integer stat8Value;
    @Order(11)
    private Integer levelRequirement;
    @Order(12)
    private Integer manaMultiplier;
    @Order(13)
    private Integer levelRequirement2;
    @Order(14)
    private Integer levelRequirement3;
    @Order(15)
    private List<Stats> quality_StatsKeys;
    @Order(16)
    private List<Integer> quality_Values;
    @Order(17)
    private Integer criticalStrikeChance;
    @Order(18)
    private Integer manaCost;
    @Order(19)
    private Integer damageEffectiveness;
    @Order(20)
    private Integer storedUses;
    @Order(21)
    private Integer cooldown;
    @Order(22)
    private Integer unknown29;
    @Order(23)
    private List<Stats> statsKeys2;
    @Order(24)
    private Boolean unknown30a;
    @Order(25)
    private Integer vaalSouls;
    @Order(26)
    private Integer vaalStoredUses;
    @Order(27)
    private Integer unknown32;
    @Order(28)
    private Integer unknown33;
    @Order(29)
    private Integer unknown34;
    @Order(30)
    private Integer damageMultiplier;
    @Order(31)
    private Integer unknown36;
    @Order(32)
    private Integer unknown37;

}
