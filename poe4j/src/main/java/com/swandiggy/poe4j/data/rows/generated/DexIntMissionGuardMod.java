
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DexIntMissionGuardMods")
public class DexIntMissionGuardMod
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Long key0;
    @Order(2)
    private int spawnWeight;
    @Order(3)
    private Boolean flag0;
    @Order(4)
    private int minLevel;
    @Order(5)
    private int maxLevel;

}
