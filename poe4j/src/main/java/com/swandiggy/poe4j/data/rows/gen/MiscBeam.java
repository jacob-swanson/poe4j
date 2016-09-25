
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MiscBeams")
public class MiscBeam
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Long key0;
    @Order(2)
    private Integer unknown3;
    @Order(3)
    private List<PreloadGroups> preloadGroupsKeys;
    @Order(4)
    private Integer unknown1;

}
