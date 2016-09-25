
package com.swandiggy.poe4j.data.rows.gen;

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
    private Integer unknown0;
    @Order(2)
    private Integer unknown1;
    @Order(3)
    private Integer unknown2;
    @Order(4)
    private Integer spawnWeight;
    @Order(5)
    private String description;
    @Order(6)
    private NPCTalk nPCTalkKey;
    @Order(7)
    private List<Characters> charactersKeys;
    @Order(8)
    private Integer unknown8;
    @Order(9)
    @Reference(value = java.lang.Integer.class, offset = 1L)
    private PVPTypes pVPTypesKey;

}
