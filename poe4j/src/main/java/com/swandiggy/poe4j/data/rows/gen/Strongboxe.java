
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Strongboxes")
public class Strongboxe
    extends BaseRow
{

    @Order(0)
    private Chests chestsKey;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private Integer unknown3;

}
