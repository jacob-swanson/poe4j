
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Achievements")
public class Achievement
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    @ReferenceOne(value = "id", offset = 1L)
    private AchievementSetsDisplay achievementSetsDisplay;
    @Order(3)
    private String objective;
    @Order(4)
    private int unknown4;
    @Order(5)
    private Boolean flag0;
    @Order(6)
    private Boolean flag1;
    @Order(7)
    private Boolean flag2;
    @Order(8)
    private Boolean flag3;
    @Order(9)
    private int unknown3;

}
