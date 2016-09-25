
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("WeaponTypes")
public class WeaponType
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private Integer critical;
    @Order(2)
    private Integer speed;
    @Order(3)
    private Integer damageMin;
    @Order(4)
    private Integer damageMax;
    @Order(5)
    private Integer rangeMax;
    @Order(6)
    private Integer null6;

}
