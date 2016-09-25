
package com.swandiggy.poe4j.data.rows.generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.*;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AtlasNode")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class AtlasNode
    extends BaseRow
{

    @Order(0)
    private WorldArea worldArea;
    @Order(1)
    private Float x;
    @Order(2)
    private Float y;
    @Order(3)
    private Integer unknown4;
    @Order(4)
    private Integer unknown5;
    @Order(5)
    private Integer unknown6;
    @Order(6)
    private List<AtlasNode> atlasNodes;
    @Order(7)
    private ItemVisualIdentity defaultVisual;
    @Order(8)
    private ItemVisualIdentity fatedVisual;
    @Order(9)
    private String flavourText;

}
