
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ShopPaymentPackagePrice
    extends BaseRow
{

    @Order(0)
    private ShopPaymentPackage ShopPaymentPackageKey;
    @Order(1)
    private ShopCountry ShopCountryKey;
    @Order(2)
    private int Price;

}
