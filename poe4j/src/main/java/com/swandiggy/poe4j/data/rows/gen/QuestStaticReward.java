
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestStaticRewards")
public class QuestStaticReward
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private BaseItemTypes statsKey;
    @Order(3)
    private Integer statValue;
    @Order(4)
    private Difficulties difficultyKey;
    @Order(5)
    private Quest questKey;
    @Order(6)
    private Integer unknown2;

}
