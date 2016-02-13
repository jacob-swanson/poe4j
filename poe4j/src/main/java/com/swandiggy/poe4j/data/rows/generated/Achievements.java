
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Achievements
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Description;
    @Order(2)
    @ReferenceOne(value = "Id", offset = 1L)
    private AchievementSetsDisplay AchievementSetsDisplayId;
    @Order(3)
    private String Objective;
    @Order(4)
    private int Unknown4;
    @Order(5)
    private Boolean Flag0;
    @Order(6)
    private Boolean Flag1;
    @Order(7)
    private Boolean Flag2;
    @Order(8)
    private Boolean Flag3;
    @Order(9)
    private int Unknown3;

}
