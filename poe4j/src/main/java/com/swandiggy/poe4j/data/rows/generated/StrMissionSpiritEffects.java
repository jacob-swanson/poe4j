
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class StrMissionSpiritEffects
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private int MinLevel;
    @Order(3)
    private int MaxLevel;
    @Order(4)
    private Long Key0;
    @Order(5)
    private List<Integer> Data1;
    @Order(6)
    private MonsterVarieties Summon_MonsterVarietiesKeys;
    @Order(7)
    private MonsterVarieties GroundEffect_MonsterVarietiesKeys;
    @Order(8)
    private int GroundEffectUnknown0;
    @Order(9)
    private int GroundEffectUnknown1;
    @Order(10)
    private Long Key3;
    @Order(11)
    private Boolean b1;
    @Order(12)
    private Boolean b2;

}
