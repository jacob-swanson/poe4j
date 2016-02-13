
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
public class LabyrinthSectionLayout
    extends BaseRow
{

    @Order(0)
    private LabyrinthSection LabyrinthSectionKey;
    @Order(1)
    private int Unknown3;
    @Order(2)
    private List<Integer> Unknown4;
    @Order(3)
    private Long Unknown6;
    @Order(4)
    private Long Unknown8;
    @Order(5)
    private Long Unknown10;

}
