
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DexMissionTracking")
public class DexMissionTracking
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Boolean flag0;
    @Order(2)
    private Integer unknown4;
    @Order(3)
    private Integer spawnWeight;
    @Order(4)
    private Integer minLevel;
    @Order(5)
    private Integer maxLevel;
    @Order(6)
    private Integer unknown5;
    @Order(7)
    private Integer unknown6;
    @Order(8)
    private Integer unknown7;
    @Order(9)
    private Boolean flag1;
    @Order(10)
    private NPCTalk nPCTalkKey;

}
