
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
public class EclipseMods
    extends BaseRow
{

    @Order(0)
    private String Key;
    @Order(1)
    private List<Tags> SpawnWeight_TagsKeys;
    @Order(2)
    private List<Integer> SpawnWeight_Values;
    @Order(3)
    private Mods ModsKey;
    @Order(4)
    private int MinLevel;
    @Order(5)
    private int MaxLevel;
    @Order(6)
    private Boolean IsPrefix;

}
