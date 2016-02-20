
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AchievementItems")
public class AchievementItem
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int unknown1;
    @Order(2)
    private int unknown2;
    @Order(3)
    private String name;
    @Order(4)
    private int unknown4;
    @Order(5)
    private Achievement achievement;
    @Order(6)
    private Byte flag0;

}
