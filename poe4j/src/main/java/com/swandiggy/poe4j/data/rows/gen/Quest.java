
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Quest")
public class Quest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer act;
    @Order(2)
    private String name;
    @Order(3)
    private Integer questState;
    @Order(4)
    private String icon_DDSFile;
    @Order(5)
    private Integer questId;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private Byte unknown6;
    @Order(8)
    private Boolean isQuest;
    @Order(9)
    private Byte unknown8;
    @Order(10)
    private Byte unknown9;
    @Order(11)
    private Boolean flag1;
    @Order(12)
    private Integer unknown11;
    @Order(13)
    private Boolean flag2;
    @Order(14)
    private Boolean flag3;

}
