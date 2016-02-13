
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
public class StrIntMissionRelicMods
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private List<Mods> ModsKeys;
    @Order(2)
    private Boolean Flag0;
    @Order(3)
    private Boolean Flag1;
    @Order(4)
    private int SpawnWeight;
    @Order(5)
    private int MinLevel;
    @Order(6)
    private int MaxLevel;

}
