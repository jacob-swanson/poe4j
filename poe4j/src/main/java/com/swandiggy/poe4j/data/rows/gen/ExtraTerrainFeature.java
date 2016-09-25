
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ExtraTerrainFeatures")
public class ExtraTerrainFeature
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Integer> unknown1;
    @Order(2)
    private List<Integer> unknown2;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private List<Integer> unknown4;
    @Order(5)
    private List<Integer> unknown5;
    @Order(6)
    private Integer unknown6;

}
