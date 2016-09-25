
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterMapBossDifficulty")
public class MonsterMapBossDifficulty
    extends BaseRow
{

    @Order(0)
    private Integer mapLevel;
    @Order(1)
    private Integer stat1Value;
    @Order(2)
    private Integer stat2Value;
    @Order(3)
    private Stats statsKey1;
    @Order(4)
    private Stats statsKey2;
    @Order(5)
    private Stats statsKey3;
    @Order(6)
    private Integer stat3Value;
    @Order(7)
    private Stats statsKey4;
    @Order(8)
    private Integer stat4Value;

}
