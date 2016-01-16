package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Jacob Swanson
 * @since 10/1/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestStates")
public class QuestState extends BaseRow {

    @Order(1)
    private Quest quest;

    @Order(2)
    private int unknown2;

    @Order(3)
    private List<Integer> questStates;

    @Order(4)
    private List<Integer> data1;

    @Order(5)
    private String text;

    @Order(6)
    private boolean flag0;

    @Order(7)
    private String message;

    @Order(8)
    private List<Long> data2;

    @Order(9)
    private int unknown9;

    @Order(10)
    private List<Integer> data3;

    @Order(11)
    private List<Long> data4;

}
