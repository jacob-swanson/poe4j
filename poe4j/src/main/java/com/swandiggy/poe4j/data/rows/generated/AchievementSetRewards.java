
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class AchievementSetRewards
    extends BaseRow
{

    @Order(0)
    @ReferenceOne(value = "Id", offset = 1L)
    private AchievementSetsDisplay AchievementSetsDisplayId;
    @Order(1)
    private int Unknown1;
    @Order(2)
    private BaseItemTypes BaseItemTypesKey;

}
