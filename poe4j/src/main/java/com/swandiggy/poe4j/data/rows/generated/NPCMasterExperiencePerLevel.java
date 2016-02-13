
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class NPCMasterExperiencePerLevel
    extends BaseRow
{

    @Order(0)
    private NPCMaster NPCMasterKey;
    @Order(1)
    private int MasterLevel;
    @Order(2)
    private int Experience;
    @Order(3)
    private int ItemLevel;
    @Order(4)
    private int Unknown5;
    @Order(5)
    private int Unknown6;

}
