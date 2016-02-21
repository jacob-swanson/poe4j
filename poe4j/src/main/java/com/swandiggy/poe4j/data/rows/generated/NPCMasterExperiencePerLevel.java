
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCMasterExperiencePerLevel")
public class NPCMasterExperiencePerLevel
    extends BaseRow
{

    @Order(0)
    private NPCMaster npcMaster;
    @Order(1)
    private int masterLevel;
    @Order(2)
    private int experience;
    @Order(3)
    private int itemLevel;
    @Order(4)
    private int unknown5;
    @Order(5)
    private int unknown6;

}
