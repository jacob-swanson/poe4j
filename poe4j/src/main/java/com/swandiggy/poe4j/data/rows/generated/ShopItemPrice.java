
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ShopItemPrice
    extends BaseRow
{

    @Order(0)
    private ShopItem ShopItemKey;
    @Order(1)
    private ShopRegion ShopRegionKey;
    @Order(2)
    private int Price;

}
