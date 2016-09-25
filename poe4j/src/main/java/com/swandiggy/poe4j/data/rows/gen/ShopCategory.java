
package com.swandiggy.poe4j.data.rows.gen;

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
    private String clientJPGFile;
    @Order(3)
    private String websiteText;
    @Order(4)
    private String websiteJPGFile;
    @Order(5)
    private Integer unknown5;

}
