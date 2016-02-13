
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ComponentCharges
    extends BaseRow
{

    @Order(0)
    @ReferenceOne("Id")
    private BaseItemTypes BaseItemTypesKey;
    @Order(1)
    private int MaxCharges;
    @Order(2)
    private int PerCharge;

}
