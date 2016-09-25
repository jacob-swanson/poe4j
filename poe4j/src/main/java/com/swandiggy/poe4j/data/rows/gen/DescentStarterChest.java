
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DescentStarterChest")
public class DescentStarterChest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Characters charactersKey;
    @Order(2)
    private BaseItemTypes baseItemTypesKey;
    @Order(3)
    private String socketColours;
    @Order(4)
    private WorldAreas worldAreasKey;

}
