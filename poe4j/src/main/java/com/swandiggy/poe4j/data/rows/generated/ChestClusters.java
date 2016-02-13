
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
public class ChestClusters
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private List<Chests> ChestsKeys;
    @Order(2)
    private List<Integer> Data1;
    @Order(3)
    private int Unknown3;
    @Order(4)
    private int Unknown4;
    @Order(5)
    private int Unknown5;

}
