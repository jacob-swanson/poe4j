
package com.swandiggy.poe4j.data.rows.generated;

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
    private ShopItem shopItem;
    @Order(1)
    private ShopRegion shopRegion;
    @Order(2)
    private int price;

}
