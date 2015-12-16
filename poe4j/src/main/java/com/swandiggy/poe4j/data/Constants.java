package com.swandiggy.poe4j.data;

/**
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public class Constants {
    /**
     * Separates the fixed width portion and the variable width portion of the .dat file
     */
    public static final long MAGIC_DATA_SEPARATOR = 0xBBbbBBbbBBbbBBbbL;

    /**
     * Value used for NULL references
     */
    public static final long MAGIC_NULL = 0xFEfeFEfeFEfeFEfeL;
}
