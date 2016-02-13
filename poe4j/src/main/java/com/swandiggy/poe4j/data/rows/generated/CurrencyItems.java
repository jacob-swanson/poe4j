
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class CurrencyItems
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes BaseItemTypesKey;
    @Order(1)
    private int Stacks;
    @Order(2)
    private int Unknown2;
    @Order(3)
    private String Action;
    @Order(4)
    private String Directions;
    @Order(5)
    private Long Key0;
    @Order(6)
    private String Description;
    @Order(7)
    private Long Key1;
    @Order(8)
    private Boolean Flag1;
    @Order(9)
    private String CosmeticTypeName;
    @Order(10)
    private Long Key2;
    @Order(11)
    private List<Long> Keys0;
    @Order(12)
    private List<Integer> Unknown17;

}
