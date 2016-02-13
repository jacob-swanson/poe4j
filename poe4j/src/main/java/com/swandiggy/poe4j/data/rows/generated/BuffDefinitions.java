
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
public class BuffDefinitions
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Description;
    @Order(2)
    private Boolean Invisible;
    @Order(3)
    private Boolean Removable;
    @Order(4)
    private String Name;
    @Order(5)
    private List<Stats> StatKeys;
    @Order(6)
    private Boolean Flag0;
    @Order(7)
    private int Unknown2;
    @Order(8)
    private Boolean Flag1;
    @Order(9)
    private Long Key0;
    @Order(10)
    private Long Key1;
    @Order(11)
    private Boolean Flag2;
    @Order(12)
    private int Unknown5;
    @Order(13)
    private BuffVisuals BuffVisualsKey;
    @Order(14)
    private Boolean Flag3;
    @Order(15)
    private Boolean Flag4;
    @Order(16)
    private int Unknown7;
    @Order(17)
    private Boolean Flag5;
    @Order(18)
    private Boolean Flag6;
    @Order(19)
    private Boolean Flag7;
    @Order(20)
    private Boolean Flag8;
    @Order(21)
    private Boolean Flag9;
    @Order(22)
    private int BuffLimit;

}
