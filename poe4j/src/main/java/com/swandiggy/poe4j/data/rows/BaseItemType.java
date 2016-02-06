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
@DatFile("BaseItemTypes")
public class BaseItemType extends BaseRow {
    @Order(1)
    private String id;

    @Order(2)
    private long itemClassKey;

    @Order(3)
    private int width;

    @Order(4)
    private int height;

    @Order(5)
    private String name;

    @Order(6)
    private String inheritsFrom;

    @Order(7)
    private int dropLevel;

    @Order(8)
    private long flavourTextKey;

    @Order(9)
    private List<Long> implicitModKeys;

    @Order(10)
    private int unknown5;

    @Order(11)
    private long soundEffectsKey;

    @Order(12)
    private List<Integer> data1;

    @Order(13)
    private List<Integer> data2;

    @Order(14)
    private List<Integer> data3;

    @Order(15)
    private List<Integer> data4;

    @Order(16)
    private List<Long> tagKeys;

    @Order(17)
    private int unknown14;

    @Order(18)
    private ItemVisualIdentity itemVisualIdentity;

    @Order(19)
    private int unknown17;

    @Order(20)
    private long key1;

    @Order(21)
    private List<Integer> data7;

    @Order(22)
    private List<Integer> data8;

    @Order(23)
    private List<Integer> data9;

    @Order(24)
    private List<Integer> data10;

    @Order(25)
    private String unknown20;

    @Order(26)
    private long key2;

    @Order(27)
    private byte unknown21;
}
