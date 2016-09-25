
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
@DatFile("AtlasQuestItems")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class AtlasQuestItem
    extends BaseRow
{

    @Order(0)
    private BaseItemType baseItemType;
    @Order(1)
    private WorldArea worldArea;
    @Order(2)
    private Integer questFlags;
    @Order(3)
    private Integer leagueQuestFlags;
    @Order(4)
    private Integer mapTier;

}
