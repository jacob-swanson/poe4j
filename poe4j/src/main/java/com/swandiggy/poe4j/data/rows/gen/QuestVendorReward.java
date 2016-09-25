
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestVendorRewards")
public class QuestVendorReward
    extends BaseRow
{

    @Order(0)
    private Integer id;
    @Order(1)
    private NPCs nPCKey;
    @Order(2)
    private Integer questState;
    @Order(3)
    private List<Characters> charactersKeys;
    @Order(4)
    private List<BaseItemTypes> baseItemTypesKeys;

}
