
package com.swandiggy.poe4j.data.rows.gen;

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
    private List<Tags> spawnWeight_TagsKeys;
    @Order(2)
    private List<Integer> spawnWeight_Values;
    @Order(3)
    private Mods modsKey;
    @Order(4)
    private Integer minLevel;
    @Order(5)
    private Integer maxLevel;
    @Order(6)
    private Boolean isPrefix;

}
