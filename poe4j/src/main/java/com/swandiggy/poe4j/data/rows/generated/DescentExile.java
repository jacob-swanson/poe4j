
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.*;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DescentExiles")
public class DescentExile
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private WorldArea worldArea;
    @Order(2)
    private Character character;
    @Order(3)
    private MonsterVariety monsterVariety;
    @Order(4)
    private int unknown7;

}
