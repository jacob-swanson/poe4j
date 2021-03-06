
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MiscObjects")
public class MiscObjects
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String effectVirtualPath;
    @Order(2)
    private List<PreloadGroups> preloadGroupsKeys;
    @Order(3)
    private Integer unknownUnique;
    @Order(4)
    private Integer unknown1;

}
