
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class QuestAchievements
    extends BaseRow
{

    @Order(0)
    private Long Key0;
    @Order(1)
    private int Unknown5;
    @Order(2)
    private Boolean Flag0;
    @Order(3)
    private Boolean Flag1;
    @Order(4)
    private Long Key1;

}
