
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ItemVisualEffect
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String DaggerEPKFile;
    @Order(2)
    private String BowEPKFile;
    @Order(3)
    private String OneHandedMaceEPKFile;
    @Order(4)
    private String OneHandedSwordEPKFile;
    @Order(5)
    private String Index5;
    @Order(6)
    private String TwoHandedSwordEPKFile;
    @Order(7)
    private String TwoHandedStaffEPKFile;
    @Order(8)
    private int Unknown0;
    @Order(9)
    private String TwoHandedMaceEPKFile;
    @Order(10)
    private String OneHandedAxeEPKFile;
    @Order(11)
    private String TwoHandedAxeEPKFile;
    @Order(12)
    private String ClawEPKFile;
    @Order(13)
    private String PETFile;
    @Order(14)
    private Boolean Flag1;

}
