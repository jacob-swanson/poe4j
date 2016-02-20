
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("TalismanPacks")
public class TalismanPack
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<MonsterPack> monsterPacks;
    @Order(2)
    private int unknown4;
    @Order(3)
    private int unknown5;
    @Order(4)
    private MonsterVariety monsterVariety;
    @Order(5)
    private int unknown8;
    @Order(6)
    private int unknown9;
    @Order(7)
    private int unknown10;
    @Order(8)
    private int unknown11;
    @Order(9)
    private MonsterPack monsterPack;

}
