
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class BuffVisuals
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String BuffIcon;
    @Order(2)
    private String EPKFile1;
    @Order(3)
    private String EPKFile2;
    @Order(4)
    private Long Key0;
    @Order(5)
    private Long Key1;
    @Order(6)
    private int Unknown6;

}
