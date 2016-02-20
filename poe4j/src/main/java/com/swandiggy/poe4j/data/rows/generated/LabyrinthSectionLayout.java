
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthSectionLayout")
public class LabyrinthSectionLayout
    extends BaseRow
{

    @Order(0)
    private LabyrinthSection labyrinthSection;
    @Order(1)
    private int unknown3;
    @Order(2)
    private List<Integer> unknown4;
    @Order(3)
    private Long unknown6;
    @Order(4)
    private Long unknown8;
    @Order(5)
    private Long unknown10;

}
