
package com.swandiggy.poe4j.data.rows.gen;

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
    private Integer spawnChance;
    @Order(2)
    private Integer minLevel;
    @Order(3)
    private Integer maxLevel;
    @Order(4)
    private Integer tier4Number;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private Integer tier3Number;
    @Order(7)
    private Integer unknown7;
    @Order(8)
    private Integer tier2Number;
    @Order(9)
    private Integer unknown9;
    @Order(10)
    private Integer tier1Number;

}
