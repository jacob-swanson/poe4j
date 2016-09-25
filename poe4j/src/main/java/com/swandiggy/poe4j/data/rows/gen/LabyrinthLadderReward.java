
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthLadderRewards")
public class LabyrinthLadderReward
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private Long key0;

}
