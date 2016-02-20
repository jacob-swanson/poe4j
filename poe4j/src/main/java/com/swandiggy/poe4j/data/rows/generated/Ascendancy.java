
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.*;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Ascendancy")
public class Ascendancy
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int classNo;
    @Order(2)
    private Character character;
    @Order(3)
    private String unknown5;
    @Order(4)
    private String unknown6;
    @Order(5)
    private String unknown7;
    @Order(6)
    private String unknown8;
    @Order(7)
    private String unknown9;

}
