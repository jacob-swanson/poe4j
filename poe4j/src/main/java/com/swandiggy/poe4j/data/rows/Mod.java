package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Jacob Swanson
 * @since 9/5/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Mods")
public class Mod extends BaseRow {
    @Order(1)
    private String id;

    @Order(2)
    private int unknown0;

    @Order(3)
    private long modTypeKey;

    @Order(4)
    private int level;

    @Order(5)
    private long stat1;

    @Order(6)
    private long stat2;

    @Order(7)
    private long stat3;

    @Order(8)
    private long stat4;

    @Order(9)
    private int domain;

    @Order(10)
    private String name;

    @Order(11)
    private int generationType;

    @Order(12)
    private String correctGroup;

    @Order(13)
    private int stat1Min;

    @Order(14)
    private int stat1Max;

    @Order(15)
    private int stat2Min;

    @Order(16)
    private int stat2Max;

    @Order(17)
    private int stat3Min;

    @Order(18)
    private int stat3Max;

    @Order(19)
    private int stat4Min;

    @Order(20)
    private int stat4Max;

    @Order(21)
    private List<Long> spawnWeightTagKeys;

    @Order(22)
    private List<Integer> spawnWeightValues;

    @Order(23)
    private long buffDefinitionsKey;

    @Order(24)
    private int buffValue;

    @Order(25)
    private List<Tag> tags;

    @Order(26)
    private long grantedEffectsPerLevelKey;

    @Order(27)
    private List<Long> data1;

    @Order(28)
    private List<Long> data2;

    @Order(29)
    private String monsterMetadata;

    @Order(30)
    private List<Integer> data3;

    @Order(31)
    private List<Integer> data4;

    @Order(32)
    private long key0;

    @Order(33)
    private int stat5Min;

    @Order(34)
    private int stat5Max;

    @Order(35)
    private long stat5;

    @Order(36)
    private List<Long> keys0;
}
