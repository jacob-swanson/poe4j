
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("EventSeasonRewards")
public class EventSeasonReward
    extends BaseRow
{

    @Order(0)
    private EventSeason eventSeason;
    @Order(1)
    private int point;
    @Order(2)
    private String rewardCommand;

}
