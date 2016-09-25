
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Characters")
public class Characters
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private String aOFile;
    @Order(3)
    private String aCTFile;
    @Order(4)
    private Integer baseMaxLife;
    @Order(5)
    private Integer baseMaxMana;
    @Order(6)
    private Integer weaponSpeed;
    @Order(7)
    private Integer minDamage;
    @Order(8)
    private Integer maxDamage;
    @Order(9)
    private Integer maxAttackDistance;
    @Order(10)
    private String icon;
    @Order(11)
    private Integer unknown6;
    @Order(12)
    private Integer baseStrength;
    @Order(13)
    private Integer baseDexterity;
    @Order(14)
    private Integer baseIntelligence;
    @Order(15)
    private List<Long> keys0;
    @Order(16)
    private String description;
    @Order(17)
    private BaseItemTypes startSkillGem_BaseItemTypesKey;
    @Order(18)
    private Integer unknown13;
    @Order(19)
    private Integer unknown14;
    @Order(20)
    private Integer unknown15;
    @Order(21)
    private Integer unknown16;
    @Order(22)
    private Integer characterSize;
    @Order(23)
    private String introSoundFile;
    @Order(24)
    private BaseItemTypes startWeapon_BaseItemTypesKey;
    @Order(25)
    private Integer unknown28;
    @Order(26)
    private String traitDescription;

}
