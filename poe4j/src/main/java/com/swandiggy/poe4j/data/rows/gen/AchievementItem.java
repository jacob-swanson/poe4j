
package com.swandiggy.poe4j.data.rows.gen;

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
    private Integer unknown1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private String name;
    @Order(4)
    private Integer completionsRequired;
    @Order(5)
    private Achievements achievementsKey;
    @Order(6)
    private Boolean flag0;

}
