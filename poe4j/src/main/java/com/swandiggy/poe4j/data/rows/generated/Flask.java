
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Flasks")
public class Flask
    extends BaseRow
{

    @Order(0)
    private BaseItemType baseItemType;
    @Order(1)
    private String name;
    @Order(2)
    private int group;
    @Order(3)
    private int lifePerUse;
    @Order(4)
    private int manaPerUse;
    @Order(5)
    private int recoveryTime;
    @Order(6)
    private BuffDefinition buffDefinition;
    @Order(7)
    private List<Integer> buffStatValue;

}
