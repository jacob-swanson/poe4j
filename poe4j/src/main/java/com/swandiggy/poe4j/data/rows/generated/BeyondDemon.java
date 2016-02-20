
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BeyondDemons")
public class BeyondDemon
    extends BaseRow
{

    @Order(0)
    private Long monsterVariety;
    @Order(1)
    private Byte flag0;
    @Order(2)
    private Byte flag1;

}
