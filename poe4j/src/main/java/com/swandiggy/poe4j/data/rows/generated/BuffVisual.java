
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
@DatFile("BuffVisuals")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BuffVisual
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String buffIcon;
    @Order(2)
    private String epkFile1;
    @Order(3)
    private String epkFile2;
    @Order(4)
    private MiscAnimated miscAnimated;
    @Order(5)
    private MiscAnimated miscAnimated2;
    @Order(6)
    private int unknown6;
    @Order(7)
    private PreloadGroup preloadGroup;
    @Order(8)
    private Boolean flag0;

}
