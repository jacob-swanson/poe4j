
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
public class DexMissionMods
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private List<Mods> ModsKey;
    @Order(3)
    private Boolean Flag0;
    @Order(4)
    private Boolean Flag1;
    @Order(5)
    private int MinLevel;
    @Order(6)
    private int MaxLevel;
    @Order(7)
    private Boolean Flag2;

}
