
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Difficulties")
public class Difficulties
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer resistances;
    @Order(2)
    private Integer minimumLevel;
    @Order(3)
    private String text;
    @Order(4)
    private String prefix;

}
