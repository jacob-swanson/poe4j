
package com.swandiggy.poe4j.data.rows.generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemVisualEffect")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ItemVisualEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String daggerEpkFile;
    @Order(2)
    private String bowEpkFile;
    @Order(3)
    private String oneHandedMaceEpkFile;
    @Order(4)
    private String oneHandedSwordEpkFile;
    @Order(5)
    private String index5;
    @Order(6)
    private String twoHandedSwordEpkFile;
    @Order(7)
    private String twoHandedStaffEpkFile;
    @Order(8)
    private int unknown0;
    @Order(9)
    private String twoHandedMaceEpkFile;
    @Order(10)
    private String oneHandedAxeEpkFile;
    @Order(11)
    private String twoHandedAxeEpkFile;
    @Order(12)
    private String clawEpkFile;
    @Order(13)
    private String petFile;
    @Order(14)
    private Boolean flag1;

}
