
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrIntMissionRelicMods")
public class StrIntMissionRelicMod
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Mods> mods;
    @Order(2)
    private Boolean flag0;
    @Order(3)
    private Boolean flag1;
    @Order(4)
    private int spawnWeight;
    @Order(5)
    private int minLevel;
    @Order(6)
    private int maxLevel;

}