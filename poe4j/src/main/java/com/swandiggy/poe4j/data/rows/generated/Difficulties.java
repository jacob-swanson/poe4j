
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Difficulties
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int Resistances;
    @Order(2)
    private int MinimumLevel;
    @Order(3)
    private String Text;
    @Order(4)
    private String Prefix;

}
