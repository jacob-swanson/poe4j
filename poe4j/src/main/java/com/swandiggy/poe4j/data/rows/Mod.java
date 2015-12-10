package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jacob Swanson
 * @since 9/5/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Mods")
public class Mod extends AbstractRow {
    @Order(1)
    private int idRef;

    @Order(2)
    private int unknown0;

    @Order(3)
    private int level;

    @Order(4)
    private long stat1;

    @Order(5)
    private long stat2;

    @Order(6)
    private long stat3;

    @Order(7)
    private long stat4;

    @Order(8)
    private int domain;

    @Order(9)
    private int name;

    @Order(10)
    private int generationType;

    @Order(11)
    private int correctGroup;

    @Order(12)
    private int stat1Min;

    @Order(13)
    private int stat1Max;

    @Order(14)
    private int stat2Min;

    @Order(15)
    private int stat2Max;

    @Order(16)
    private int stat3Min;

    @Order(17)
    private int stat3Max;

    @Order(18)
    private int stat4Min;

    @Order(19)
    private int stat4Max;

    @Order(20)
    private long data0;

    @Order(21)
    private long data1;

    @Order(22)
    private long unknown27;

    @Order(23)
    private int unknown28;

    @Order(24)
    private long data2;

    @Order(25)
    private long unknown32;

    @Order(26)
    private long data3;

    @Order(27)
    private long data4;

    @Order(28)
    private int metaData;

    @Order(29)
    private long unknown39;

    @Order(30)
    private long unknown41;

    @Order(31)
    private long unknown43;

    @Order(32)
    private int unknown45;

    @Order(33)
    private int unknown46;

    @Order(34)
    private long unknown47;
}
