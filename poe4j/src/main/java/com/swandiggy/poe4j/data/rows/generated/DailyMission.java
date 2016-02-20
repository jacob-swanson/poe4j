
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DailyMissions")
public class DailyMission
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int unknown0;
    @Order(2)
    private int unknown1;
    @Order(3)
    private int unknown2;
    @Order(4)
    private int spawnWeight;
    @Order(5)
    private String description;
    @Order(6)
    private NPCTalk nPCTalk;
    @Order(7)
    private List<Character> characters;
    @Order(8)
    private int unknown8;
    @Order(9)
    @Reference(value = java.lang.Integer.class, offset = 1L)
    private PVPType pVPType;

}
