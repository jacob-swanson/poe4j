
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrMissionSpiritSecondaryEffects")
public class StrMissionSpiritSecondaryEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private Integer minLevel;
    @Order(3)
    private Integer maxLevel;
    @Order(4)
    private Long key0;
    @Order(5)
    private Integer f7;
    @Order(6)
    private Integer f8;
    @Order(7)
    private MonsterVarieties monsterVarietiesKey;
    @Order(8)
    private Long key2;

}
