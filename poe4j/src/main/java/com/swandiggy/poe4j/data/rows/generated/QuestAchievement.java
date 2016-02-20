
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestAchievements")
public class QuestAchievement
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private int unknown5;
    @Order(2)
    private Boolean flag0;
    @Order(3)
    private Boolean flag1;
    @Order(4)
    private Long key1;

}
