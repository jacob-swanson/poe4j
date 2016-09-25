
package com.swandiggy.poe4j.data.rows.gen;

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
    private EventSeason eventSeasonKey;
    @Order(1)
    private Integer point;
    @Order(2)
    private String rewardCommand;

}
