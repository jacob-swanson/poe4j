
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("EclipseMods")
public class EclipseMod
    extends BaseRow
{

    @Order(0)
    private String key;
    @Order(1)
    private List<Tags> spawnWeightTags;
    @Order(2)
    private List<Integer> spawnWeightValue;
    @Order(3)
    private Mods mod;
    @Order(4)
    private int minLevel;
    @Order(5)
    private int maxLevel;
    @Order(6)
    private Boolean isPrefix;

}
