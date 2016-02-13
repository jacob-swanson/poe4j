
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class DexIntMissionGuardMods
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Long Key0;
    @Order(2)
    private int SpawnWeight;
    @Order(3)
    private Boolean Flag0;
    @Order(4)
    private int MinLevel;
    @Order(5)
    private int MaxLevel;

}
