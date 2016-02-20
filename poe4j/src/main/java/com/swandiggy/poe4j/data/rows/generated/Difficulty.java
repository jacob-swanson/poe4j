
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Difficulties")
public class Difficulty
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int resistance;
    @Order(2)
    private int minimumLevel;
    @Order(3)
    private String text;
    @Order(4)
    private String prefix;

}
