
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BuffDefinitions")
public class BuffDefinitions
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    private Boolean invisible;
    @Order(3)
    private Boolean removable;
    @Order(4)
    private String name;
    @Order(5)
    private List<Stats> statsKeys;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private Integer unknown2;
    @Order(8)
    private Boolean flag1;
    @Order(9)
    private Stats maximum_StatsKey;
    @Order(10)
    private Stats current_StatsKey;
    @Order(11)
    private Boolean flag2;
    @Order(12)
    private Integer unknown5;
    @Order(13)
    private BuffVisuals buffVisualsKey;
    @Order(14)
    private Boolean flag3;
    @Order(15)
    private Boolean flag4;
    @Order(16)
    private Integer unknown7;
    @Order(17)
    private Boolean flag5;
    @Order(18)
    private Boolean flag6;
    @Order(19)
    private Boolean flag7;
    @Order(20)
    private Boolean flag8;
    @Order(21)
    private Boolean flag9;
    @Order(22)
    private Integer buffLimit;
    @Order(23)
    private Boolean flag10;
    @Order(24)
    private String unknown0;
    @Order(25)
    private Boolean isRecovery;

}
