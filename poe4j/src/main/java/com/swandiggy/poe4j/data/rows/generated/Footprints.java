
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
public class Footprints
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private List<String> Active_AnimatedObjectFiles;
    @Order(2)
    private List<String> Idle_AnimatedObjectFiles;

}
