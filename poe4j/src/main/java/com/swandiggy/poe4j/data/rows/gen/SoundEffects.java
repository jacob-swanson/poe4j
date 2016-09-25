
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SoundEffects")
public class SoundEffects
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String soundFile;
    @Order(2)
    private String soundFile_2D;
    @Order(3)
    private Boolean unknown3;

}
