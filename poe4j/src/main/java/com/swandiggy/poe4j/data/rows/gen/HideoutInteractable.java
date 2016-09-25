
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("HideoutInteractable")
public class HideoutInteractable
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private String object;

}
