
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ShopPaymentPackagePrice")
public class ShopPaymentPackagePrice
    extends BaseRow
{

    @Order(0)
    private ShopPaymentPackage shopPaymentPackage;
    @Order(1)
    private ShopCountry shopCountry;
    @Order(2)
    private int price;

}
