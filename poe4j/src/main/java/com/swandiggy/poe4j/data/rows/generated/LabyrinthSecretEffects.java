
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
public class LabyrinthSecretEffects
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private MonsterVarieties MonsterVarietiesKey;
    @Order(2)
    private MonsterPacks MonsterPacksKey;
    @Order(3)
    private Boolean Flag0;
    @Order(4)
    private BuffDefinitions Buff_BuffDefinitionsKey;
    @Order(5)
    private List<Integer> Buff_Values;
    @Order(6)
    private Boolean Flag1;
    @Order(7)
    private String OTFile;
    @Order(8)
    private Boolean Flag2;

}
