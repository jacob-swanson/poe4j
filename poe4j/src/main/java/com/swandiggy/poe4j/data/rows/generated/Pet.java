
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Pet
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private BaseItemTypes BaseItemTypesKey;
    @Order(2)
    private int Unknown3;
    @Order(3)
    private int Unknown4;
    @Order(4)
    private int Unknown1;

}
