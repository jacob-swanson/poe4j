
package com.swandiggy.poe4j.data.rows.gen;

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
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private Integer stacks;
    @Order(2)
    private Integer currencyUseType;
    @Order(3)
    private String action;
    @Order(4)
    private String directions;
    @Order(5)
    private BaseItemTypes fullStack_BaseItemTypesKey;
    @Order(6)
    private String description;
    @Order(7)
    private List<AchievementItem> usage_AchievementItemsKeys;
    @Order(8)
    private Boolean flag1;
    @Order(9)
    private String cosmeticTypeName;
    @Order(10)
    private AchievementItem possession_AchievementItemsKey;
    @Order(11)
    private List<Long> keys0;
    @Order(12)
    private List<Integer> unknown17;
    @Order(13)
    private Integer currencyTab_StackSize;
    @Order(14)
    private String abbreviation;

}
