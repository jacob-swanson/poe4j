
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
public class GrantedEffectsPerLevel
    extends BaseRow
{

    @Order(0)
    private GrantedEffects GrantedEffectsKey;
    @Order(1)
    private int Level;
    @Order(2)
    private List<Stats> StatsKeys;
    @Order(3)
    private int Stat1Value;
    @Order(4)
    private int Stat2Value;
    @Order(5)
    private int Stat3Value;
    @Order(6)
    private int Stat4Value;
    @Order(7)
    private int Stat5Value;
    @Order(8)
    private int Stat6Value;
    @Order(9)
    private int Stat7Value;
    @Order(10)
    private int Stat8Value;
    @Order(11)
    private ActiveSkills ActiveSkillsKey;
    @Order(12)
    private int LevelRequirement;
    @Order(13)
    private int ManaMultiplier;
    @Order(14)
    private int LevelRequirement2;
    @Order(15)
    private int LevelRequirement3;
    @Order(16)
    private List<Stats> Quality_StatsKeys;
    @Order(17)
    private List<Integer> Quality_Values;
    @Order(18)
    private int CriticalStrikeChance;
    @Order(19)
    private int ManaCost;
    @Order(20)
    private int Unknown26;
    @Order(21)
    private int Unknown27;
    @Order(22)
    private int Unknown28;
    @Order(23)
    private int Unknown29;
    @Order(24)
    private List<Stats> StatsKeys2;
    @Order(25)
    private Boolean Unknown30;
    @Order(26)
    private int VaalSouls;
    @Order(27)
    private int Unknown32;
    @Order(28)
    private int Unknown32b;
    @Order(29)
    private int Unknown33;
    @Order(30)
    private int Unknown34;
    @Order(31)
    private int DamageMultiplier;
    @Order(32)
    private int Unknown35;

}
