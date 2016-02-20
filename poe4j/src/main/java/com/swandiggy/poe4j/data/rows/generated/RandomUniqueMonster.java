
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("RandomUniqueMonsters")
public class RandomUniqueMonster
    extends BaseRow
{

    @Order(0)
    private Long unknown0;
    @Order(1)
    private List<Long> data0;

}
