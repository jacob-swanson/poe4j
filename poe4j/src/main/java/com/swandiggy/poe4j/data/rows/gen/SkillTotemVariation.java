
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
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
    @Reference(value = java.lang.Integer.class, offset = 1L)
    private SkillTotems skillTotemsKey;
    @Order(1)
    private Integer totemSkinId;
    @Order(2)
    private MonsterVarieties monsterVarietiesKey;

}
