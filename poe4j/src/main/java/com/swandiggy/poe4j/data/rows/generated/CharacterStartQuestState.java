
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
public class CharacterStartQuestState
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private List<Quest> QuestKeys;
    @Order(2)
    private List<Integer> QuestStates;
    @Order(3)
    private List<Long> Keys1;
    @Order(4)
    private List<QuestVendorRewards> QuestVendorRewardsKeys;
    @Order(5)
    private List<Integer> Unknown9;

}
