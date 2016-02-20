
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MicrotransactionFireworksVariations")
public class MicrotransactionFireworksVariation
    extends BaseRow
{

    @Order(0)
    private BaseItemType baseItemType;
    @Order(1)
    private String aOFile;
    @Order(2)
    private Boolean flag0;

}
