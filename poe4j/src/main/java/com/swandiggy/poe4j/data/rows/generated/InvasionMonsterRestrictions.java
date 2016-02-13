
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
public class InvasionMonsterRestrictions
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Long InvasionMonsterGroupsKey;
    @Order(2)
    private Long Key1;
    @Order(3)
    private List<Integer> Data0;

}
