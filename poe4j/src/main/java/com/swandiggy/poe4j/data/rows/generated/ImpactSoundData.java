
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ImpactSoundData
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Sound;
    @Order(2)
    private int Unknown2;
    @Order(3)
    private int Unknown3;
    @Order(4)
    private int Unknown4;
    @Order(5)
    private int Unknown5;

}
