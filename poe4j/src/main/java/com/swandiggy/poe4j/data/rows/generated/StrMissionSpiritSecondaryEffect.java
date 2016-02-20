
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrMissionSpiritSecondaryEffects")
public class StrMissionSpiritSecondaryEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int spawnWeight;
    @Order(2)
    private int minLevel;
    @Order(3)
    private int maxLevel;
    @Order(4)
    private Long key0;
    @Order(5)
    private int f7;
    @Order(6)
    private int f8;
    @Order(7)
    private Long key1;
    @Order(8)
    private Long key2;

}
