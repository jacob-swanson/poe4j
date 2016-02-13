
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
public class Maps
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes BaseItemTypesKey;
    @Order(1)
    private WorldAreas Regular_WorldAreasKey;
    @Order(2)
    private WorldAreas Unique_WorldAreasKey;
    @Order(3)
    private BaseItemTypes MapUpgrade_BaseItemTypesKey;
    @Order(4)
    private List<MonsterPacks> MonsterPacksKeys;
    @Order(5)
    private Long Key2;
    @Order(6)
    private String Regular_GuildCharacter;
    @Order(7)
    private String Unique_GuildCharacter;
    @Order(8)
    private List<BaseItemTypes> HigherTierMaps_BaseItemTypesKeys;
    @Order(9)
    private int Tier;

}
