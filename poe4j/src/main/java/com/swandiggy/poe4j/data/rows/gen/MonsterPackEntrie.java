
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterPackEntries")
public class MonsterPackEntrie
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private MonsterPacks monsterPacksKey;
    @Order(2)
    private Boolean flag0;
    @Order(3)
    private Integer unknown1;
    @Order(4)
    private MonsterVarieties monsterVarietiesKey;

}
