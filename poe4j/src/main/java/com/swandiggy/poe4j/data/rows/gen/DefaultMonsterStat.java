
package com.swandiggy.poe4j.data.rows.gen;

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
    private Float damage;
    @Order(2)
    private Integer evasion;
    @Order(3)
    private Integer accuracy;
    @Order(4)
    private Integer stat4;
    @Order(5)
    private Integer experience;
    @Order(6)
    private Integer life;
    @Order(7)
    private Difficulties difficultyKey;

}
