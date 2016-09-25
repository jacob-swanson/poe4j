
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
    private int stacks;
    @Order(2)
    private int currencyUseType;
    @Order(3)
    private String action;
    @Order(4)
    private String direction;
    @Order(5)
    private BaseItemType fullStackBaseItemType;
    @Order(6)
    private String description;
    @Order(7)
    private AchievementItem usageAchievement;
    @Order(8)
    private Boolean flag1;
    @Order(9)
    private String cosmeticTypeName;
    @Order(10)
    private AchievementItem possessionAchievement;
    @Order(11)
    private List<Long> keys0;
    @Order(12)
    private List<Integer> unknown17;
    @Order(13)
    private Integer currencyTabStackSize;
    @Order(14)
    private String abbreviation;

}
