package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jacob Swanson
 * @since 9/16/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Quest")
public class Quest extends BaseRow {

    @Order(1)
    private String strId;

    @Order(2)
    private int act;

    @Order(3)
    private String title;

    @Order(4)
    private int questState;

    @Order(5)
    private String questIcon;

    @Order(6)
    private int questId;

    @Order(7)
    private boolean uniqueItem;

    @Order(8)
    private byte unknown6;

    @Order(9)
    private boolean isQuest;

    @Order(10)
    private byte unknown8;

    @Order(11)
    private byte unknown9;

    @Order(12)
    private byte unknown10;

    @Order(13)
    private int unknown11;

    public void setIsQuest(boolean isQuest) {
        this.isQuest = isQuest;
    }
}
