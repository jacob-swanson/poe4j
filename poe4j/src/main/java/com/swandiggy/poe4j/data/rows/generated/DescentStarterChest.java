
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.*;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DescentStarterChest")
public class DescentStarterChest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Character character;
    @Order(2)
    private BaseItemType baseItemType;
    @Order(3)
    private String socketColour;
    @Order(4)
    private WorldArea worldArea;

}
