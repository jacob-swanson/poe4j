
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class WarbandsPackNumbers
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnChance;
    @Order(2)
    private int MinLevel;
    @Order(3)
    private int MaxLevel;
    @Order(4)
    private int Tier4Number;
    @Order(5)
    private int Unknown5;
    @Order(6)
    private int Tier3Number;
    @Order(7)
    private int Unknown7;
    @Order(8)
    private int Tier2Number;
    @Order(9)
    private int Unknown9;
    @Order(10)
    private int Tier1Number;

}
