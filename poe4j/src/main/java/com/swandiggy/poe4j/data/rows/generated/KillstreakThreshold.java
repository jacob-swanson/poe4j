
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("KillstreakThresholds")
public class KillstreakThreshold
    extends BaseRow
{

    @Order(0)
    private int kill;
    @Order(1)
    private MonsterVariety monsterVariety;
    @Order(2)
    private Long keys0;

}
