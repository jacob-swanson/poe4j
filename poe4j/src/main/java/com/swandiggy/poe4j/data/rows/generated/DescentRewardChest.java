
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DescentRewardChests")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class DescentRewardChest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<BaseItemType> baseItemTypes1;
    @Order(2)
    private List<BaseItemType> baseItemTypes2;
    @Order(3)
    private List<BaseItemType> baseItemTypes3;
    @Order(4)
    private List<BaseItemType> baseItemTypes4;
    @Order(5)
    private List<BaseItemType> baseItemTypes5;
    @Order(6)
    private List<BaseItemType> baseItemTypes6;
    @Order(7)
    private List<BaseItemType> baseItemTypes7;
    @Order(8)
    private List<BaseItemType> baseItemTypes8;
    @Order(9)
    private List<BaseItemType> baseItemTypes9;
    @Order(10)
    private List<BaseItemType> baseItemTypes10;
    @Order(11)
    private List<BaseItemType> baseItemTypes11;
    @Order(12)
    private List<BaseItemType> baseItemTypes12;
    @Order(13)
    private WorldArea worldArea;
    @Order(14)
    private List<BaseItemType> baseItemTypes13;
    @Order(15)
    private List<BaseItemType> baseItemTypes14;

}
