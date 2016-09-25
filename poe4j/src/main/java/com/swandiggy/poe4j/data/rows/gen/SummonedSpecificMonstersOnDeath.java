
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SummonedSpecificMonstersOnDeath")
public class SummonedSpecificMonstersOnDeath
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private MonsterVarieties monsterVarietiesKey;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Long key1;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Byte unknown7;

}
