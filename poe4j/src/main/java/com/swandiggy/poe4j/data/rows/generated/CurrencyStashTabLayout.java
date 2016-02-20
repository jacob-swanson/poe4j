
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CurrencyStashTabLayout")
public class CurrencyStashTabLayout
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private int unknown0;
    @Order(2)
    private int unknown1;

}
