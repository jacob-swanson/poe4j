
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DefaultMonsterStats")
public class DefaultMonsterStat
    extends BaseRow
{

    @Order(0)
    private String displayLevel;
    @Order(1)
    private int damage;
    @Order(2)
    private int stat2;
    @Order(3)
    private int accuracy;
    @Order(4)
    private int stat4;
    @Order(5)
    private int stat5;
    @Order(6)
    private int life;
    @Order(7)
    private Difficulty difficulty;

}
