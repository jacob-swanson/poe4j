
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DailyOverrides")
public class DailyOverride
    extends BaseRow
{

    @Order(0)
    private int unknown0;
    @Order(1)
    private DailyMission dailyMissions;

}
