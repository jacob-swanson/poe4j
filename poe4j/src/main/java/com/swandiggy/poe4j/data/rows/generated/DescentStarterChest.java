
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class DescentStarterChest
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Characters CharactersKey;
    @Order(2)
    private BaseItemTypes BaseItemTypesKey;
    @Order(3)
    private String SocketColours;
    @Order(4)
    private WorldAreas WorldAreasKey;

}
