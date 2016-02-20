
package com.swandiggy.poe4j.data.rows.generated;

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
    private int spawnWeight;
    @Order(2)
    private int minLevel;
    @Order(3)
    private int maxLevel;
    @Order(4)
    private Long key0;
    @Order(5)
    private List<Integer> data1;
    @Order(6)
    private MonsterVariety summon_MonsterVarieties;
    @Order(7)
    private MonsterVariety groundEffectMonsterVarieties;
    @Order(8)
    private int groundEffectUnknown0;
    @Order(9)
    private int groundEffectUnknown1;
    @Order(10)
    private Long key3;
    @Order(11)
    private Boolean b1;
    @Order(12)
    private Boolean b2;

}
