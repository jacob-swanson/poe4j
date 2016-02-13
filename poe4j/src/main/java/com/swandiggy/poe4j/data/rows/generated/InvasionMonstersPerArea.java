
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class InvasionMonstersPerArea
    extends BaseRow
{

    @Order(0)
    private WorldAreas WorldAreasKey;
    @Order(1)
    private int Unknown0;
    @Order(2)
    private int Unknown1;
    @Order(3)
    private List<Integer> Data0;
    @Order(4)
    private List<MonsterVarieties> MonsterVarietiesKeys1;
    @Order(5)
    private List<MonsterVarieties> MonsterVarietiesKeys2;
    @Order(6)
    private int Unknown2;
    @Order(7)
    private int Unknown3;
    @Order(8)
    private int Unknown4;

}
