
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
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
    private BaseItemType baseItemType;
    @Order(1)
    private WorldArea regularWorldArea;
    @Order(2)
    private WorldArea uniqueWorldArea;
    @Order(3)
    private BaseItemType mapUpgradeBaseItemType;
    @Order(4)
    private List<MonsterPack> monsterPacks;
    @Order(5)
    private Long key2;
    @Order(6)
    private String regularGuildCharacter;
    @Order(7)
    private String uniqueGuildCharacter;
    @Order(8)
    private List<BaseItemType> higherTierMapsBaseItemTypes;
    @Order(9)
    private int tier;

}
