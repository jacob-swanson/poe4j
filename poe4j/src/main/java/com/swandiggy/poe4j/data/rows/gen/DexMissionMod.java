
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DexMissionMods")
public class DexMissionMod
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private List<Mods> modsKey;
    @Order(3)
    private Boolean flag0;
    @Order(4)
    private Boolean flag1;
    @Order(5)
    private Integer minLevel;
    @Order(6)
    private Integer maxLevel;
    @Order(7)
    private Boolean flag2;

}
