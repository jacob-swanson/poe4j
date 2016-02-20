
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ShopCategory")
public class ShopCategory
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String clientText;
    @Order(2)
    private String clientJpgFile;
    @Order(3)
    private String websiteText;
    @Order(4)
    private String websiteJpgFile;
    @Order(5)
    private Integer unknown5;

}
