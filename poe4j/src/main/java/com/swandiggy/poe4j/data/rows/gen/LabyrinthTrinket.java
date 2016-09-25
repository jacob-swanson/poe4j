
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthTrinkets")
public class LabyrinthTrinket
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private LabyrinthSecret labyrinthSecretsKey;
    @Order(2)
    private BuffDefinitions buff_BuffDefinitionsKey;
    @Order(3)
    private List<Integer> buff_Values;

}
