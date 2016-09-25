
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ShopItemPrice")
public class ShopItemPrice
    extends BaseRow
{

    @Order(0)
    private ShopItem shopItemKey;
    @Order(1)
    private ShopRegion shopRegionKey;
    @Order(2)
    private Integer price;

}
