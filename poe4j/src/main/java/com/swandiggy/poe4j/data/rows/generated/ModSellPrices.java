
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ModSellPrices
    extends BaseRow
{

    @Order(0)
    private Mods ModsKey;
    @Order(1)
    private List<BaseItemTypes> BaseItemTypesKeys0;
    @Order(2)
    private List<BaseItemTypes> BaseItemTypesKeys1;

}
