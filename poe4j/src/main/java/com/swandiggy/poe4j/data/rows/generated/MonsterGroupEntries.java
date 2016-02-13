
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class MonsterGroupEntries
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private MonsterVarieties MonsterVarietiesKey;
    @Order(2)
    private int MonsterGroupNamesId;

}
