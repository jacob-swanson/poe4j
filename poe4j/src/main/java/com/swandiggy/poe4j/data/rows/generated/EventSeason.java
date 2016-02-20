
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("EventSeason")
public class EventSeason
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int unknown1;
    @Order(2)
    private String rewardCommand;

}
