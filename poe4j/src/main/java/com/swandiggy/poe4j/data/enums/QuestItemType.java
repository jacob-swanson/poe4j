package com.swandiggy.poe4j.data.enums;

/**
 * @author Jacob Swanson
 * @since 9/16/2015
 */
public enum QuestItemType {
    UNKNOWN1,
    UNKNOWN2,
    NORMAL,
    MAGIC,
    RARE,
    OTHER;

    public static QuestItemType valueOf(Integer n) {
        return values()[n];
    }
}
