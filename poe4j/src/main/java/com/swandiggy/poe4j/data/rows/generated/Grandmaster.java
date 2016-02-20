
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Grandmasters")
public class Grandmaster
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String gm;
    @Order(2)
    private String ai;
    @Order(3)
    private List<Mods> mods;
    @Order(4)
    private Integer characterLevel;

}
