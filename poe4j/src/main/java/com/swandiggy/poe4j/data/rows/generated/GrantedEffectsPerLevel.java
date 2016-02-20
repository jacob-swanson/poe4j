
package com.swandiggy.poe4j.data.rows.generated;

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
    private GrantedEffect grantedEffect;
    @Order(1)
    private int level;
    @Order(2)
    private List<Stats> stats1;
    @Order(3)
    private int stat1Value;
    @Order(4)
    private int stat2Value;
    @Order(5)
    private int stat3Value;
    @Order(6)
    private int stat4Value;
    @Order(7)
    private int stat5Value;
    @Order(8)
    private int stat6Value;
    @Order(9)
    private int stat7Value;
    @Order(10)
    private int stat8Value;
    @Order(11)
    private ActiveSkill activeSkill;
    @Order(12)
    private int levelRequirement;
    @Order(13)
    private int manaMultiplier;
    @Order(14)
    private int levelRequirement2;
    @Order(15)
    private int levelRequirement3;
    @Order(16)
    private List<Stats> qualityStats;
    @Order(17)
    private List<Integer> qualityValues;
    @Order(18)
    private int criticalStrikeChance;
    @Order(19)
    private int manaCost;
    @Order(20)
    private int unknown26;
    @Order(21)
    private int unknown27;
    @Order(22)
    private int unknown28;
    @Order(23)
    private int unknown29;
    @Order(24)
    private List<Stats> stats2;
    @Order(25)
    private Boolean unknown30;
    @Order(26)
    private int vaalSoul;
    @Order(27)
    private int unknown32;
    @Order(28)
    private int unknown32b;
    @Order(29)
    private int unknown33;
    @Order(30)
    private int unknown34;
    @Order(31)
    private int damageMultiplier;
    @Order(32)
    private int unknown35;

}
