
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
public class QuestVendorRewards
    extends BaseRow
{

    @Order(0)
    private int Id;
    @Order(1)
    private NPCs NPCKey;
    @Order(2)
    private int QuestState;
    @Order(3)
    private List<Characters> CharactersKeys;
    @Order(4)
    private List<BaseItemTypes> BaseItemTypesKeys;

}
