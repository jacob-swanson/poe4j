
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemisedVisualEffect")
public class ItemisedVisualEffect
    extends BaseRow
{

    @Order(0)
    private BaseItemType baseItemType;
    @Order(1)
    private ItemVisualEffect itemVisualEffect;
    @Order(2)
    private ItemVisualIdentity itemVisualIdentity1;
    @Order(3)
    private ItemVisualIdentity itemVisualIdentity2;
    @Order(4)
    private List<Long> keys0;
    @Order(5)
    private List<Integer> data1;
    @Order(6)
    private List<Long> keys2;
    @Order(7)
    private Boolean flag0;
    @Order(8)
    private List<Integer> data3;

}
