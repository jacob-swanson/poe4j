
package com.swandiggy.poe4j.data.rows.gen;

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
    private String gMFile;
    @Order(2)
    private String aISFile;
    @Order(3)
    private List<Mods> modsKeys;
    @Order(4)
    private Integer characterLevel;
    @Order(5)
    private Boolean flag0;

}
