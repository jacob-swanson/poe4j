
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("WarbandsPackNumbers")
public class WarbandsPackNumber
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int spawnChance;
    @Order(2)
    private int minLevel;
    @Order(3)
    private int maxLevel;
    @Order(4)
    private int tier4Number;
    @Order(5)
    private int unknown5;
    @Order(6)
    private int tier3Number;
    @Order(7)
    private int unknown7;
    @Order(8)
    private int tier2Number;
    @Order(9)
    private int unknown9;
    @Order(10)
    private int tier1Number;

}
