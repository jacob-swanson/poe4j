
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Commands
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Command;
    @Order(2)
    private Boolean Flag0;
    @Order(3)
    private String Command2;

}
