
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DescentExiles")
public class DescentExile
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private WorldAreas worldAreasKey;
    @Order(2)
    private Characters charactersKey;
    @Order(3)
    private MonsterVarieties monsterVarietiesKey;
    @Order(4)
    private Integer unknown7;

}
