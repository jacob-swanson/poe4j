
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class DexMissionTracking
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Boolean Flag0;
    @Order(2)
    private int Unknown4;
    @Order(3)
    private int SpawnWeight;
    @Order(4)
    private int MinLevel;
    @Order(5)
    private int MaxLevel;
    @Order(6)
    private int Unknown5;
    @Order(7)
    private int Unknown6;
    @Order(8)
    private int Unknown7;
    @Order(9)
    private Boolean Flag1;
    @Order(10)
    private NPCTalk NPCTalkKey;

}
