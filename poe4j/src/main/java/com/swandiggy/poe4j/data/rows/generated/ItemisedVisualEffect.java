
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
public class ItemisedVisualEffect
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes BaseItemTypesKey;
    @Order(1)
    private ItemVisualEffect ItemVisualEffectKey;
    @Order(2)
    private ItemVisualIdentity ItemVisualIdentityKey1;
    @Order(3)
    private ItemVisualIdentity ItemVisualIdentityKey2;
    @Order(4)
    private List<Long> Keys0;
    @Order(5)
    private List<Integer> Data1;
    @Order(6)
    private List<Long> Keys2;
    @Order(7)
    private Boolean Flag0;
    @Order(8)
    private List<Integer> Data3;

}
