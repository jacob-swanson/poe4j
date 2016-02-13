
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class MonsterPackEntries
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private MonsterPacks MonsterPacksKey;
    @Order(2)
    private Boolean Flag0;
    @Order(3)
    private int Unknown1;
    @Order(4)
    private MonsterVarieties MonsterVarietiesKey;

}
