
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestVendorRewards")
public class QuestVendorRewards
    extends BaseRow
{

    @Order(0)
    private int id;
    @Order(1)
    private NPC nPC;
    @Order(2)
    private int questState;
    @Order(3)
    private List<Character> characters;
    @Order(4)
    private List<BaseItemType> baseItemTypes;

}
