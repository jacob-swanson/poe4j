
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
public class ShopPaymentPackage
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Text;
    @Order(2)
    private int Coins;
    @Order(3)
    private Boolean AvailableFlag;
    @Order(4)
    private int Unknown5;
    @Order(5)
    private int Unknown6;
    @Order(6)
    private Boolean Flag0;
    @Order(7)
    private Boolean ContainsBetaKey;
    @Order(8)
    private List<Integer> Data0;
    @Order(9)
    private String OverviewMessage;
    @Order(10)
    private Long Key0;
    @Order(11)
    private String BackgroundImage;
    @Order(12)
    private String PurchaseMessage;

}
