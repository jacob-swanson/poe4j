
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Stats")
public class Stats
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Boolean flag0;
    @Order(2)
    private Boolean isLocal;
    @Order(3)
    private Boolean isWeaponLocal;
    @Order(4)
    private int unknown2;
    @Order(5)
    private Boolean flag3;
    @Order(6)
    private String text;
    @Order(7)
    private Boolean flag5;
    @Order(8)
    private Boolean flag6;
    @Order(9)
    @Reference(Integer.class)
    private Stats aliasStatsKey1;
    @Order(10)
    @Reference(Integer.class)
    private Stats aliasStatsKey2;
    @Order(11)
    private Boolean flag7;
    @Order(12)
    private int unknown3;

}
