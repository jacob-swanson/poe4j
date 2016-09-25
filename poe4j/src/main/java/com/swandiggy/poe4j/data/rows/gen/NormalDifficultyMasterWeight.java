
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NormalDifficultyMasterWeights")
public class NormalDifficultyMasterWeight
    extends BaseRow
{

    @Order(0)
    private Integer masterID;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Integer unknown4;

}
