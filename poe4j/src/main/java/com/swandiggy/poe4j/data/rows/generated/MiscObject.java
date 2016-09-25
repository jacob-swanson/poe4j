
package com.swandiggy.poe4j.data.rows.generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MiscObjects")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class MiscObject
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String effectVirtualPath;
    @Order(2)
    private Boolean flag0;
    @Order(3)
    private List<PreloadGroup> preloadGroups;
    @Order(4)
    private Integer unknownUnique;
    @Order(5)
    private Integer unknown1;

}
