
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Notifications
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Boolean Unknown0;
    @Order(2)
    private Boolean Unknown1;
    @Order(3)
    private String Message;
    @Order(4)
    private String Unknown2;
    @Order(5)
    private Boolean Unknown3;
    @Order(6)
    private int Unknown4;

}
