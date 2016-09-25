
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("WarbandsMapGraph")
public class WarbandsMapGraph
    extends BaseRow
{

    @Order(0)
    private WorldAreas worldAreasKey;
    @Order(1)
    private List<Integer> connections;

}
