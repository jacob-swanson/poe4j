
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SummonedSpecificMonsters")
public class SummonedSpecificMonster
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private MonsterVarieties monsterVarietiesKey;
    @Order(2)
    private Integer unknown3;
    @Order(3)
    private Long key0;

}
