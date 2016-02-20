
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrIntMissionRelicPatterns")
public class StrIntMissionRelicPattern
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int allyRelicCount;
    @Order(2)
    private int unknown;
    @Order(3)
    private List<Mods> relicMods;
    @Order(4)
    private Boolean isEnemyRelic;
    @Order(5)
    private Boolean isAllyRelic;
    @Order(6)
    private int spawnWeight;
    @Order(7)
    private int minLevel;
    @Order(8)
    private int maxLevel;
    @Order(9)
    private int enemyRelicCount;

}
