
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("InvasionMonsterRestrictions")
public class InvasionMonsterRestriction
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Long invasionMonsterGroup;
    @Order(2)
    private Long key1;
    @Order(3)
    private List<Integer> data0;

}
