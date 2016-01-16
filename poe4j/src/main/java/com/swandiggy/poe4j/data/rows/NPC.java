package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Jacob Swanson
 * @since 9/30/2015
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCs")
public class NPC extends BaseRow {

    @Order(1)
    private String index0;

    @Order(2)
    private String name;

    @Order(3)
    private int unknown2;

    @Order(4)
    private List<Integer> soldItemWeights;

    @Order(5)
    private List<Tag> soldItemTags;

    @Order(6)
    private int unknown7;

    @Order(7)
    private List<Long> data0Keys;

    @Order(8)
    private List<Integer> data0Values;

    @Order(9)
    private List<Long> keys1;

    @Order(10)
    private List<String> greetingAudioFiles;

    @Order(11)
    private String inheritsFrom;

    @Order(12)
    private List<String> farewellAudioFiles;

    @Order(13)
    private int unknown19;

    @Order(14)
    private long npcMasterIndex;
    // TODO: Create NPCMaster rows
//    @ReferenceOne(Long.class)
//    private NPCMaster npcMaster;

    @Order(15)
    private String nameShort;

    @Order(16)
    private int unknown11;

    @Order(17)
    private int unknown12;

}
