
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class DefaultMonsterStats
    extends BaseRow
{

    @Order(0)
    private String DisplayLevel;
    @Order(1)
    private int Damage;
    @Order(2)
    private int Stat2;
    @Order(3)
    private int Accuracy;
    @Order(4)
    private int Stat4;
    @Order(5)
    private int Stat5;
    @Order(6)
    private int Life;
    @Order(7)
    private Difficulties DifficultyKey;

}
