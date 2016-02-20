
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Shrines")
public class Shrine
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int unknown0;
    @Order(2)
    private String name;
    @Order(3)
    private Boolean chargesShared;
    @Order(4)
    private ShrineBuff playerShrineBuff;
    @Order(5)
    private int unknown4;
    @Order(6)
    private int unknown5;
    @Order(7)
    private String description;
    @Order(8)
    private ShrineBuff monsterShrineBuff;
    @Order(9)
    private MonsterVariety summonMonsterMonsterVariety;
    @Order(10)
    private MonsterVariety summonPlayerMonsterVariety;
    @Order(11)
    private int unknown10;
    @Order(12)
    private int unknown11;
    @Order(13)
    private ShrineSound shrineSound;
    @Order(14)
    private Boolean unknown14;
    @Order(15)
    private Long key0;
    @Order(16)
    private Boolean unknown16;

}
