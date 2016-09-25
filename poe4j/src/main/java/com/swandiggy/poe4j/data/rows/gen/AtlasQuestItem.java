
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AtlasQuestItems")
public class AtlasQuestItem
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private WorldAreas worldAreasKey;
    @Order(2)
    private Integer questFlags;
    @Order(3)
    private Integer leagueQuestFlags;
    @Order(4)
    private Integer mapTier;

}
