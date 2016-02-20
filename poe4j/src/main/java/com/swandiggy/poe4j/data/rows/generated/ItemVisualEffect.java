
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemVisualEffect")
public class ItemVisualEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String daggerEPKFile;
    @Order(2)
    private String bowEPKFile;
    @Order(3)
    private String oneHandedMaceEPKFile;
    @Order(4)
    private String oneHandedSwordEPKFile;
    @Order(5)
    private String index5;
    @Order(6)
    private String twoHandedSwordEPKFile;
    @Order(7)
    private String twoHandedStaffEPKFile;
    @Order(8)
    private int unknown0;
    @Order(9)
    private String twoHandedMaceEPKFile;
    @Order(10)
    private String oneHandedAxeEPKFile;
    @Order(11)
    private String twoHandedAxeEPKFile;
    @Order(12)
    private String clawEPKFile;
    @Order(13)
    private String pETFile;
    @Order(14)
    private Boolean flag1;

}
