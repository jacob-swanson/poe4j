package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Jacob Swanson
 * @since 9/7/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ItemVisualIdentity extends BaseRow {

    @Order(1)
    private String index0;

    @Order(2)
    private String index1;

    @Order(3)
    private String index2;

    @Order(4)
    private long unknown0;

    @Order(5)
    private int unknown1;

    @Order(6)
    private String fmt;

    @Order(7)
    private String strength;

    @Order(8)
    private String dexterity;

    @Order(9)
    private String intelligence;

    @Order(10)
    private String strengthDexterity;

    @Order(11)
    private String strengthIntelligence;

    @Order(12)
    private String dexterityIntelligence;

    @Order(13)
    private String strengthDexterityIntelligence;

    @Order(14)
    private String warriorShape;

    @Order(15)
    private String hunterShape;

    @Order(16)
    private String witchShape;

    @Order(17)
    private String duelistShape;

    @Order(18)
    private String templarShape;

    @Order(19)
    private String shadowShape;

    @Order(20)
    private String scionShape;

    @Order(21)
    private int unknown17;

    @Order(22)
    private int unknown18;

    @Order(23)
    private int unknown19;

    @Order(24)
    private String unknown20;

    @Order(25)
    private String animateGuardian;

    @Order(26)
    private int unknown22;

    @Order(27)
    private String unknown23;

    @Order(28)
    private String unknown24;

    @Order(29)
    private List<Integer> data0;

}
