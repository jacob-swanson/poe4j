
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SkillTotemVariations")
public class SkillTotemVariation
    extends BaseRow
{

    @Order(0)
    private int unknown;
    @Order(1)
    private int unknown1;
    @Order(2)
    private MonsterVariety monsterVariety;

}
