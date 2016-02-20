
package com.swandiggy.poe4j.data.rows.generated;

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
    private BaseItemType baseItemType;
    @Order(1)
    private int critical;
    @Order(2)
    private int speed;
    @Order(3)
    private int damageMin;
    @Order(4)
    private int damageMax;
    @Order(5)
    private int rangeMax;
    @Order(6)
    private int null6;

}
