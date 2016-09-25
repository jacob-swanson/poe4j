
package com.swandiggy.poe4j.data.rows.gen;

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

    @Order(0)
    private ModSellPriceType modSellPriceTypesKey;
    @Order(1)
    private List<BaseItemTypes> baseItemTypesKeys;

}
