
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class QuestStaticRewards
    extends BaseRow
{

    @Order(0)
    private int Unknown0;
    @Order(1)
    private int Unknown1;
    @Order(2)
    private BaseItemTypes StatsKey;
    @Order(3)
    private int StatValue;
    @Order(4)
    private Difficulties DifficultyKey;
    @Order(5)
    private Quest QuestKey;
    @Order(6)
    private int Unknown2;

}
