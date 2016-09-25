
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("PerandusChests")
public class PerandusChest
    extends BaseRow
{

    @Order(0)
    private Chests chestsKey;
    @Order(1)
    private Integer unknown2;
    @Order(2)
    private Integer unknown4;
    @Order(3)
    private Integer minLevel;
    @Order(4)
    private Integer maxLevel;

}
