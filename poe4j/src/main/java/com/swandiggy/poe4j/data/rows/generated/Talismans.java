
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Talismans
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes BaseItemTypesKey;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private Mods ModsKey;
    @Order(3)
    private int Tier;
    @Order(4)
    private Boolean Flag0;
    @Order(5)
    private Boolean Flag1;
    @Order(6)
    private Long Key0;
    @Order(7)
    private Long Key1;
    @Order(8)
    private int Unknown11;

}
