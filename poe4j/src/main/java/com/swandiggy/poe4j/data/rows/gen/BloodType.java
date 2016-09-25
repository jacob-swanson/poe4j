
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BloodTypes")
public class BloodType
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String pETFile1;
    @Order(2)
    private String pETFile2;
    @Order(3)
    private String pETFile3;
    @Order(4)
    private Long key0;
    @Order(5)
    private String pETFile4;
    @Order(6)
    private String pETFile5;
    @Order(7)
    private String pETFile6;
    @Order(8)
    private Long key1;
    @Order(9)
    private List<Long> keys0;
    @Order(10)
    private Long key2;
    @Order(11)
    private String pETFile7;
    @Order(12)
    private String pETFile8;
    @Order(13)
    private String pETFile9;

}
