
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCs")
public class NPC
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private int unknown2;
    @Order(3)
    private List<Integer> soldItemWeights;
    @Order(4)
    private List<Tags> soldItemTags;
    @Order(5)
    private int unknown7;
    @Order(6)
    private List<Long> data0Keys;
    @Order(7)
    private List<Integer> data0Values;
    @Order(8)
    private List<Long> keys1;
    @Order(9)
    private List<String> greetingAudioFile;
    @Order(10)
    private String inheritsFrom;
    @Order(11)
    private List<String> farewellAudioFile;
    @Order(12)
    private int unknown19;
    @Order(13)
    private NPCMaster npcMaster;
    @Order(14)
    private String nameShort;
    @Order(15)
    private int unknown11;
    @Order(16)
    private int unknown12;

}
