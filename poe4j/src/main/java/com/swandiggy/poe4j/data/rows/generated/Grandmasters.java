
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
public class Grandmasters
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String GM;
    @Order(2)
    private String AI;
    @Order(3)
    private List<Mods> ModsKeys;
    @Order(4)
    private int CharacterLevel;

}
