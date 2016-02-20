
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterMapDifficulty")
public class MonsterMapDifficulty
    extends BaseRow
{

    @Order(0)
    private int mapLevel;
    @Order(1)
    private int stat1Value;
    @Order(2)
    private int stat2Value;
    @Order(3)
    private Stats statsKey1;
    @Order(4)
    private Stats statsKey2;
    @Order(5)
    private Stats statsKey3;
    @Order(6)
    private int stat3Value;
    @Order(7)
    private Stats statsKey4;
    @Order(8)
    private int stat4Value;

}
