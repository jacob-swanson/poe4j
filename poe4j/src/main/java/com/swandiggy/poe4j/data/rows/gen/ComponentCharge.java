
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ComponentCharges")
public class ComponentCharge
    extends BaseRow
{

    @Order(0)
    @ReferenceOne("id")
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private Integer maxCharges;
    @Order(2)
    private Integer perCharge;

}
