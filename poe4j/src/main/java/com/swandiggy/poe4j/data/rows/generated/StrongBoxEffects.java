
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class StrongBoxEffects
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Normal_EPKFile;
    @Order(2)
    private String Normal_Closed_AOFile;
    @Order(3)
    private String Normal_Open_AOFile;
    @Order(4)
    private String Magic_EPKFile;
    @Order(5)
    private String Unique_EPKFile;
    @Order(6)
    private String Rare_EPKFile;
    @Order(7)
    private String Magic_Closed_AOFile;
    @Order(8)
    private String Unique_Closed_AOFile;
    @Order(9)
    private String Rare_Closed_AOFile;
    @Order(10)
    private String Magic_Open_AOFile;
    @Order(11)
    private String Unique_Open_AOFile;
    @Order(12)
    private String Rare_Open_AOFile;

}
