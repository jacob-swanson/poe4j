
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("TalismanMonsterMods")
public class TalismanMonsterMod
    extends BaseRow
{

    @Order(0)
    private int unknown1;
    @Order(1)
    private int unknown2;
    @Order(2)
    private Long key0;

}
