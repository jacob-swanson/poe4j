
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
public class GrantedEffects
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Boolean IsSupport;
    @Order(2)
    private List<Integer> Data0;
    @Order(3)
    private String SupportGemLetter;
    @Order(4)
    private int Unknown3;
    @Order(5)
    private List<Integer> Data1;
    @Order(6)
    private List<Integer> Data2;
    @Order(7)
    private Boolean Flag1;
    @Order(8)
    private Integer Unknown4;
    @Order(9)
    private List<Integer> Unknown5;
    @Order(10)
    private Boolean Flag0;

}
