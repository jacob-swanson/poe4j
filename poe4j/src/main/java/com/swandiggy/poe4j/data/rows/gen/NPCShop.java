
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCShop")
public class NPCShop
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private List<Tags> soldItem_TagsKeys;
    @Order(3)
    private List<Integer> soldItem_Weights;
    @Order(4)
    private List<Long> data0_Keys0;
    @Order(5)
    private List<Integer> data0_Values;
    @Order(6)
    private Integer unknown10;
    @Order(7)
    private List<Long> unknown11;

}
