
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
@DatFile("ShopPaymentPackage")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ShopPaymentPackage
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String text;
    @Order(2)
    private int coin;
    @Order(3)
    private Boolean availableFlag;
    @Order(4)
    private int unknown5;
    @Order(5)
    private int unknown6;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private Boolean containsBeta;
    @Order(8)
    private List<Integer> data0;
    @Order(9)
    private String overviewMessage;
    @Order(10)
    private Long key0;
    @Order(11)
    private String backgroundImage;
    @Order(12)
    private String purchaseMessage;

}
