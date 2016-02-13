
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class BindableVirtualKeys
    extends BaseRow
{

    @Order(0)
    private int KeyCode;
    @Order(1)
    private String Name;
    @Order(2)
    private String Id;

}
