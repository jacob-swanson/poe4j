
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class BeyondDemons
    extends BaseRow
{

    @Order(0)
    private Long MonsterVarietiesKey;
    @Order(1)
    private Byte Flag0;
    @Order(2)
    private Byte Flag1;

}
