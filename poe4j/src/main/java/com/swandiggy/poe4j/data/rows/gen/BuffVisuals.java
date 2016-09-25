
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BuffVisuals")
public class BuffVisuals
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String buffDDSFile;
    @Order(2)
    private String ePKFile1;
    @Order(3)
    private String ePKFile2;
    @Order(4)
    private MiscAnimated miscAnimatedKey;
    @Order(5)
    private MiscAnimated miscAnimatedKey2;
    @Order(6)
    private Integer unknown6;
    @Order(7)
    private List<PreloadGroups> preloadGroupsKeys;
    @Order(8)
    private Boolean flag0;

}
