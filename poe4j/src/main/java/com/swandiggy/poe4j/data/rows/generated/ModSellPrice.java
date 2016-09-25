
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ModSellPrices")
public class ModSellPrice
    extends BaseRow
{
    @Order(1)
    private List<ModSellPrices> modSellPrices;
    @Order(2)
    private List<BaseItemType> baseItemTypes;

}
