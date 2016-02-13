
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Stats
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Boolean Flag0;
    @Order(2)
    private Boolean IsLocal;
    @Order(3)
    private Boolean IsWeaponLocal;
    @Order(4)
    private int Unknown2;
    @Order(5)
    private Boolean Flag3;
    @Order(6)
    private String Text;
    @Order(7)
    private Boolean Flag5;
    @Order(8)
    private Boolean Flag6;
    @Order(9)
    @Reference(Integer.class)
    private Stats Alias_StatsKey1;
    @Order(10)
    @Reference(Integer.class)
    private Stats Alias_StatsKey2;
    @Order(11)
    private Boolean Flag7;
    @Order(12)
    private int Unknown3;

}
