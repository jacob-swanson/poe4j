
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Pet")
public class Pet
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private BaseItemType baseItemType;
    @Order(2)
    private int unknown3;
    @Order(3)
    private int unknown4;
    @Order(4)
    private int unknown1;

}