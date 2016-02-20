
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BuffVisuals")
public class BuffVisual
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String buffIcon;
    @Order(2)
    private String epkFile1;
    @Order(3)
    private String epkFile2;
    @Order(4)
    private Long key0;
    @Order(5)
    private Long key1;
    @Order(6)
    private int unknown6;

}
