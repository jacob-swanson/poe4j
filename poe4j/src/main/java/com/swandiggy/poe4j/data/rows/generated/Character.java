
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
@DatFile("Characters")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Character
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private String aoFile;
    @Order(3)
    private String actFile;
    @Order(4)
    private int baseMaxLife;
    @Order(5)
    private int baseMaxMana;
    @Order(6)
    private int weaponSpeed;
    @Order(7)
    private int minDamage;
    @Order(8)
    private int maxDamage;
    @Order(9)
    private int maxAttackDistance;
    @Order(10)
    private String icon;
    @Order(11)
    private int unknown6;
    @Order(12)
    private int baseStrength;
    @Order(13)
    private int baseDexterity;
    @Order(14)
    private int baseIntelligence;
    @Order(15)
    private List<Long> keys0;
    @Order(16)
    private String description;
    @Order(17)
    private BaseItemType startSkillGem;
    @Order(18)
    private int unknown13;
    @Order(19)
    private int unknown14;
    @Order(20)
    private int unknown15;
    @Order(21)
    private int unknown16;
    @Order(22)
    private int characterSize;
    @Order(23)
    private String introSoundFile;
    @Order(24)
    private BaseItemType startWeapon;
    @Order(25)
    private Integer unknown28;
    @Order(26)
    private String traitDescription;

}
