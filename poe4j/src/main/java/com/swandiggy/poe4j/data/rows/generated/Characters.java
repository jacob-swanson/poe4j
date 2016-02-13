
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
public class Characters
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Name;
    @Order(2)
    private String AOFile;
    @Order(3)
    private String ACTFile;
    @Order(4)
    private int BaseMaxLife;
    @Order(5)
    private int BaseMaxMana;
    @Order(6)
    private int WeaponSpeed;
    @Order(7)
    private int MinDamage;
    @Order(8)
    private int MaxDamage;
    @Order(9)
    private int MaxAttackDistance;
    @Order(10)
    private String Icon;
    @Order(11)
    private int Unknown6;
    @Order(12)
    private int BaseStrength;
    @Order(13)
    private int BaseDexterity;
    @Order(14)
    private int BaseIntelligence;
    @Order(15)
    private List<Long> Keys0;
    @Order(16)
    private String Description;
    @Order(17)
    private BaseItemTypes StartSkillGem_BaseItemTypesKey;
    @Order(18)
    private int Unknown13;
    @Order(19)
    private int Unknown14;
    @Order(20)
    private int Unknown15;
    @Order(21)
    private int Unknown16;
    @Order(22)
    private int CharacterSize;
    @Order(23)
    private String IntroSoundFile;
    @Order(24)
    private BaseItemTypes StartWeapon_BaseItemTypesKey;
    @Order(25)
    private Integer Unknown28;

}
