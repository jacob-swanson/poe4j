
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
public class Flasks
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes BaseItemTypesKey;
    @Order(1)
    private String Name;
    @Order(2)
    private int Group;
    @Order(3)
    private int LifePerUse;
    @Order(4)
    private int ManaPerUse;
    @Order(5)
    private int RecoveryTime;
    @Order(6)
    private BuffDefinitions BuffDefinitionsKey;
    @Order(7)
    private List<Integer> BuffStatValues;

}
