
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class MonsterMapDifficulty
    extends BaseRow
{

    @Order(0)
    private int MapLevel;
    @Order(1)
    private int Stat1Value;
    @Order(2)
    private int Stat2Value;
    @Order(3)
    private Stats StatsKey1;
    @Order(4)
    private Stats StatsKey2;
    @Order(5)
    private Stats StatsKey3;
    @Order(6)
    private int Stat3Value;
    @Order(7)
    private Stats StatsKey4;
    @Order(8)
    private int Stat4Value;

}
