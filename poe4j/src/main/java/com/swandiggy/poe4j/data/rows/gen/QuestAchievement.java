
package com.swandiggy.poe4j.data.rows.gen;

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
    private AchievementItem achievementItemsKey;
    @Order(1)
    private Integer questState;
    @Order(2)
    private Boolean isHardcoreAchievement;
    @Order(3)
    private Boolean isStandardAchievement;
    @Order(4)
    private Difficulties difficultiesKey;
    @Order(5)
    private Integer unknown1;

}
