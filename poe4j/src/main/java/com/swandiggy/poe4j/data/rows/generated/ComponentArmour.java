
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
public class ComponentArmour
    extends BaseRow
{

    @Order(0)
    @ReferenceOne("Id")
    private BaseItemTypes BaseItemTypesKey;
    @Order(1)
    private int Armour;
    @Order(2)
    private int Evasion;
    @Order(3)
    private int EnergyShield;

}
