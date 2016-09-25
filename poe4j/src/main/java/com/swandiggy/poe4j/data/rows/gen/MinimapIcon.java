
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MinimapIcons")
public class MinimapIcon
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer unknown2;
    @Order(2)
    private Integer unknown3;
    @Order(3)
    private Boolean flag0;
    @Order(4)
    private Boolean flag1;
    @Order(5)
    private Boolean flag2;

}
