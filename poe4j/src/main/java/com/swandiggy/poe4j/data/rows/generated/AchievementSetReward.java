
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AchievementSetRewards")
public class AchievementSetReward
    extends BaseRow
{

    @Order(0)
    @ReferenceOne(value = "id", offset = 1L)
    private AchievementSetsDisplay achievementSetsDisplay;
    @Order(1)
    private int unknown1;
    @Order(2)
    private BaseItemType baseItemType;

}
