
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthRewards")
public class LabyrinthReward
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Long key0;
    @Order(3)
    private Integer unknown4;
    @Order(4)
    private Long key1;
    @Order(5)
    private Integer unknown7;
    @Order(6)
    private Integer unknown8;

}
