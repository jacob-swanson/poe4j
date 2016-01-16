package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Jacob Swanson
 * @since 9/6/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Characters")
public class Character extends BaseRow {
    @Order(1)
    private String id;

    @Order(2)
    private String name;

    @Order(3)
    private String animatedObject;

    @Order(4)
    private String actor;

    @Order(5)
    private int baseMaxLife;

    @Order(6)
    private int baseMaxMana;

    @Order(7)
    private int weaponSpeed;

    @Order(8)
    private int minDamage;

    @Order(9)
    private int maxDamage;

    @Order(10)
    private int maxAttackDistance;

    @Order(11)
    private String icon;

    @Order(12)
    private int unknown6;

    @Order(13)
    private int baseStrength;

    @Order(14)
    private int baseDexterity;

    @Order(15)
    private int baseIntelligence;

    @Order(16)
    private List<Long> data0;

    @Order(17)
    private String description;

    @Order(18)
    private int unknown11;

    @Order(19)
    private int unknown12;

    @Order(20)
    private int unknown13;

    @Order(21)
    private int unknown14;

    @Order(22)
    private int unknown15;

    @Order(23)
    private int unknown16;

    @Order(24)
    private int unknown17;

    @Order(25)
    private String unknown18;

    @Order(26)
    private int unknown26;

    @Order(27)
    private int unknown27;

    @Order(28)
    private int unknown28;
}
