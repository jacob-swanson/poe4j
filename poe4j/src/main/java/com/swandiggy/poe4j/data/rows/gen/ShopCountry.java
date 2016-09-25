
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ShopCountry")
public class ShopCountry
    extends BaseRow
{

    @Order(0)
    private String countryTwoLetterCode;
    @Order(1)
    private String country;
    @Order(2)
    private ShopCurrency shopCurrencyKey;

}
