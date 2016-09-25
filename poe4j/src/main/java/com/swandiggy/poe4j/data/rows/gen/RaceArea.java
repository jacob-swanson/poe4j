
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("RaceAreas")
public class RaceArea
    extends BaseRow
{

    @Order(0)
    private Races racesKey;
    @Order(1)
    private WorldAreas worldAreasKey;
    @Order(2)
    private List<Mods> modsKeys;
    @Order(3)
    private List<Long> keys0;

}
