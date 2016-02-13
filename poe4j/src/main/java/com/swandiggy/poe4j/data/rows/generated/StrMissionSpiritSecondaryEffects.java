
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class StrMissionSpiritSecondaryEffects
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private int MinLevel;
    @Order(3)
    private int MaxLevel;
    @Order(4)
    private Long Key0;
    @Order(5)
    private int f7;
    @Order(6)
    private int f8;
    @Order(7)
    private Long Key1;
    @Order(8)
    private Long Key2;

}
