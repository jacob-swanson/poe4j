
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestStaticRewards")
public class QuestStaticReward
    extends BaseRow
{

    @Order(0)
    private int unknown0;
    @Order(1)
    private int unknown1;
    @Order(2)
    private BaseItemType stat;
    @Order(3)
    private int statValue;
    @Order(4)
    private Difficulty difficulty;
    @Order(5)
    private Quest quest;
    @Order(6)
    private int unknown2;

}
