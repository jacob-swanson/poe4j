
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthSecretEffects")
public class LabyrinthSecretEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private MonsterVarieties monsterVarietiesKey;
    @Order(2)
    private BuffDefinitions buff_BuffDefinitionsKey;
    @Order(3)
    private List<Integer> buff_Values;
    @Order(4)
    private String oTFile;

}
