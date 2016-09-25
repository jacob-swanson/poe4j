
package com.swandiggy.poe4j.data.rows.gen;

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
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private ItemVisualEffect itemVisualEffectKey;
    @Order(2)
    private ItemVisualIdentity itemVisualIdentityKey1;
    @Order(3)
    private ItemVisualIdentity itemVisualIdentityKey2;
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
