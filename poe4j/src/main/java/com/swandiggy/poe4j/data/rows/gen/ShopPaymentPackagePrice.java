
package com.swandiggy.poe4j.data.rows.gen;

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
    private ShopPaymentPackage shopPaymentPackageKey;
    @Order(1)
    private ShopCountry shopCountryKey;
    @Order(2)
    private Integer price;

}
