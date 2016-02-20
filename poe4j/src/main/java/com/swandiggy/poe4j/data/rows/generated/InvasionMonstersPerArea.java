
package com.swandiggy.poe4j.data.rows.generated;

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
    private WorldArea worldArea;
    @Order(1)
    private int unknown0;
    @Order(2)
    private int unknown1;
    @Order(3)
    private List<Integer> data0;
    @Order(4)
    private List<MonsterVariety> monsterVarieties1;
    @Order(5)
    private List<MonsterVariety> monsterVarieties2;
    @Order(6)
    private int unknown2;
    @Order(7)
    private int unknown3;
    @Order(8)
    private int unknown4;

}
