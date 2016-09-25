
package com.swandiggy.poe4j.data.rows.gen;

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
    private Integer allyRelicCount;
    @Order(2)
    private Integer unknown;
    @Order(3)
    private List<Mods> relic_ModsKeys;
    @Order(4)
    private Boolean isEnemyRelic;
    @Order(5)
    private Boolean isAllyRelic;
    @Order(6)
    private Integer spawnWeight;
    @Order(7)
    private Integer minLevel;
    @Order(8)
    private Integer maxLevel;
    @Order(9)
    private Integer enemyRelicCount;

}
