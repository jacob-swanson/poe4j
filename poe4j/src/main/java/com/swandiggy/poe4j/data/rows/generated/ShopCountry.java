
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ShopCountry
    extends BaseRow
{

    @Order(0)
    private String CountryTwoLetterCode;
    @Order(1)
    private String Country;
    @Order(2)
    private ShopCurrency ShopCurrencyKey;

}
