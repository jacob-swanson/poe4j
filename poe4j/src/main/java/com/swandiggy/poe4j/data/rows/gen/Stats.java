
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
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
    private Integer unknown2;
    @Order(5)
    private Boolean flag3;
    @Order(6)
    private String text;
    @Order(7)
    private Boolean flag5;
    @Order(8)
    private Boolean flag6;
    @Order(9)
    @Reference(java.lang.Integer.class)
    private Stats alias_StatsKey1;
    @Order(10)
    @Reference(java.lang.Integer.class)
    private Stats alias_StatsKey2;
    @Order(11)
    private Boolean flag7;
    @Order(12)
    private Integer unknown3;
    @Order(13)
    private List<Integer> unknown0;

}
