
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
public class StrIntMissionRelicPatterns
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int AllyRelicCount;
    @Order(2)
    private int Unknown;
    @Order(3)
    private List<Mods> Relic_ModsKeys;
    @Order(4)
    private Boolean IsEnemyRelic;
    @Order(5)
    private Boolean IsAllyRelic;
    @Order(6)
    private int SpawnWeight;
    @Order(7)
    private int MinLevel;
    @Order(8)
    private int MaxLevel;
    @Order(9)
    private int EnemyRelicCount;

}
