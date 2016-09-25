
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("InvasionMonstersPerArea")
public class InvasionMonstersPerArea
    extends BaseRow
{

    @Order(0)
    private WorldAreas worldAreasKey;
    @Order(1)
    private Integer unknown0;
    @Order(2)
    private Integer unknown1;
    @Order(3)
    private List<Integer> data0;
    @Order(4)
    private List<MonsterVarieties> monsterVarietiesKeys1;
    @Order(5)
    private List<MonsterVarieties> monsterVarietiesKeys2;
    @Order(6)
    private Integer unknown2;
    @Order(7)
    private Integer unknown3;
    @Order(8)
    private Integer unknown4;

}
