
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
public class ShrineBuffs
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private List<Integer> BuffStatValues;
    @Order(2)
    private BuffDefinitions BuffDefinitionsKey;
    @Order(3)
    private Long Key0;

}
