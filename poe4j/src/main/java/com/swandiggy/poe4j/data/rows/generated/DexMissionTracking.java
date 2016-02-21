
package com.swandiggy.poe4j.data.rows.generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DexMissionTracking")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class DexMissionTracking
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Boolean flag0;
    @Order(2)
    private int unknown4;
    @Order(3)
    private int spawnWeight;
    @Order(4)
    private int minLevel;
    @Order(5)
    private int maxLevel;
    @Order(6)
    private int unknown5;
    @Order(7)
    private int unknown6;
    @Order(8)
    private int unknown7;
    @Order(9)
    private Boolean flag1;
    @Order(10)
    private NPCTalk nPCTalk;

}
