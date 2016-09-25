
package com.swandiggy.poe4j.data.rows.gen;

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
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private String name;
    @Order(2)
    private Integer group;
    @Order(3)
    private Integer lifePerUse;
    @Order(4)
    private Integer manaPerUse;
    @Order(5)
    private Integer recoveryTime;
    @Order(6)
    private BuffDefinitions buffDefinitionsKey;
    @Order(7)
    private List<Integer> buffStatValues;

}
