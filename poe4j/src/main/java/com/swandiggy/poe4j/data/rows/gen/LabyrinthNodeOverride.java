
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthNodeOverrides")
public class LabyrinthNodeOverride
    extends BaseRow
{

    @Order(0)
    private String id1;
    @Order(1)
    private String id2;
    @Order(2)
    private List<Integer> data1;
    @Order(3)
    private List<Integer> data2;

}
