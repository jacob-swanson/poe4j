
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Shrines
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int Unknown0;
    @Order(2)
    private String Name;
    @Order(3)
    private Boolean ChargesShared;
    @Order(4)
    private ShrineBuffs Player_ShrineBuffsKey;
    @Order(5)
    private int Unknown4;
    @Order(6)
    private int Unknown5;
    @Order(7)
    private String Description;
    @Order(8)
    private ShrineBuffs Monster_ShrineBuffsKey;
    @Order(9)
    private MonsterVarieties SummonMonster_MonsterVarietiesKey;
    @Order(10)
    private MonsterVarieties SummonPlayer_MonsterVarietiesKey;
    @Order(11)
    private int Unknown10;
    @Order(12)
    private int Unknown11;
    @Order(13)
    private ShrineSounds ShrineSoundsKey;
    @Order(14)
    private Boolean Unknown14;
    @Order(15)
    private Long Key0;
    @Order(16)
    private Boolean Unknown16;

}
