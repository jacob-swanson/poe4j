
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class AchievementItems
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int Unknown1;
    @Order(2)
    private int Unknown2;
    @Order(3)
    private String Name;
    @Order(4)
    private int Unknown4;
    @Order(5)
    private Achievements AchievementsKey;
    @Order(6)
    private Byte Flag0;

}
