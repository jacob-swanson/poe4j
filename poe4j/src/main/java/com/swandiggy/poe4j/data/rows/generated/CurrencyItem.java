
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CurrencyItems")
public class CurrencyItem
    extends BaseRow
{

    @Order(0)
    private BaseItemType baseItemType;
    @Order(1)
    private int stack;
    @Order(2)
    private int unknown2;
    @Order(3)
    private String action;
    @Order(4)
    private String direction;
    @Order(5)
    private Long key0;
    @Order(6)
    private String description;
    @Order(7)
    private Long key1;
    @Order(8)
    private Boolean flag1;
    @Order(9)
    private String cosmeticTypeName;
    @Order(10)
    private Long key2;
    @Order(11)
    private List<Long> keys0;
    @Order(12)
    private List<Integer> unknown17;

}
