
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Maps")
public class Map
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private WorldAreas regular_WorldAreasKey;
    @Order(2)
    private WorldAreas unique_WorldAreasKey;
    @Order(3)
    private BaseItemTypes mapUpgrade_BaseItemTypesKey;
    @Order(4)
    private List<MonsterPacks> monsterPacksKeys;
    @Order(5)
    private Long key2;
    @Order(6)
    private String regular_GuildCharacter;
    @Order(7)
    private String unique_GuildCharacter;
    @Order(8)
    private List<BaseItemTypes> higherTierMaps_BaseItemTypesKeys;
    @Order(9)
    private Integer tier;
    @Order(10)
    @Reference(java.lang.Integer.class)
    private Map fated_Base_MapsKey;
    @Order(11)
    private Integer fated_AreaLevel;
    @Order(12)
    private Integer unknown1;
    @Order(13)
    private Integer unknown2;
    @Order(14)
    private Integer unknown3;

}
