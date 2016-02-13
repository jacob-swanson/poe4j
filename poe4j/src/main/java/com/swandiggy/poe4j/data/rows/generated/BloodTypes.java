
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class BloodTypes
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String PETFile1;
    @Order(2)
    private String PETFile2;
    @Order(3)
    private String PETFile3;
    @Order(4)
    private Long Key0;
    @Order(5)
    private String PETFile4;
    @Order(6)
    private String PETFile5;
    @Order(7)
    private String PETFile6;
    @Order(8)
    private Long Key1;
    @Order(9)
    private List<Long> Keys0;
    @Order(10)
    private Long Key2;

}
