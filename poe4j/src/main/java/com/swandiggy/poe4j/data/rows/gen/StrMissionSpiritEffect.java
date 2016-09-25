
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrMissionSpiritEffects")
public class StrMissionSpiritEffect
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
    private List<Integer> data1;
    @Order(6)
    private MonsterVarieties summon_MonsterVarietiesKeys;
    @Order(7)
    private MonsterVarieties groundEffect_MonsterVarietiesKeys;
    @Order(8)
    private Integer groundEffectUnknown0;
    @Order(9)
    private Integer groundEffectUnknown1;
    @Order(10)
    private Long key3;
    @Order(11)
    private Boolean b1;
    @Order(12)
    private Boolean b2;

}
