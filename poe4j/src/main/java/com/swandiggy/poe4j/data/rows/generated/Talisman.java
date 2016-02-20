
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Talismans")
public class Talisman
    extends BaseRow
{

    @Order(0)
    private BaseItemType baseItemType;
    @Order(1)
    private int spawnWeight;
    @Order(2)
    private Mods mod;
    @Order(3)
    private int tier;
    @Order(4)
    private Boolean flag0;
    @Order(5)
    private Boolean flag1;
    @Order(6)
    private Long key0;
    @Order(7)
    private Long key1;
    @Order(8)
    private int unknown11;

}
