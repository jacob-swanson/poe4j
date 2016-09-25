
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ShopPaymentPackage")
public class ShopPaymentPackage
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String text;
    @Order(2)
    private Integer coins;
    @Order(3)
    private Boolean availableFlag;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private Boolean containsBetaKey;
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
    @Order(13)
    private Boolean flag1;
    @Order(14)
    @Reference(java.lang.Integer.class)
    private ShopPaymentPackage upgrade_ShopPaymentPackageKey;
    @Order(15)
    private Integer unknown14;

}
