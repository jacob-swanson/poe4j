
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrDexIntMissionMods")
public class StrDexIntMissionMod
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Mods> modsKeys;
    @Order(2)
    private Integer spawnWeight;
    @Order(3)
    private Integer minLevel;
    @Order(4)
    private Integer maxLevel;
    @Order(5)
    private Boolean isUniqueMap;

}
