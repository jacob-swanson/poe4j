
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("GrantedEffects")
public class GrantedEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Boolean isSupport;
    @Order(2)
    private List<Integer> data0;
    @Order(3)
    private String supportGemLetter;
    @Order(4)
    private int unknown3;
    @Order(5)
    private List<Integer> data1;
    @Order(6)
    private List<Integer> data2;
    @Order(7)
    private Boolean flag1;
    @Order(8)
    private Integer unknown4;
    @Order(9)
    private List<Integer> unknown5;
    @Order(10)
    private Boolean flag0;

}
