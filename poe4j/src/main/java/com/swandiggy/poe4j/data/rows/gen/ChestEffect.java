
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ChestEffects")
public class ChestEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String normal_EPKFile;
    @Order(2)
    private String normal_Closed_AOFile;
    @Order(3)
    private String normal_Open_AOFile;
    @Order(4)
    private String magic_EPKFile;
    @Order(5)
    private String unique_EPKFile;
    @Order(6)
    private String rare_EPKFile;
    @Order(7)
    private String magic_Closed_AOFile;
    @Order(8)
    private String unique_Closed_AOFile;
    @Order(9)
    private String rare_Closed_AOFile;
    @Order(10)
    private String magic_Open_AOFile;
    @Order(11)
    private String unique_Open_AOFile;
    @Order(12)
    private String rare_Open_AOFile;

}
