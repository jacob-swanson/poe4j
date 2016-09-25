
package com.swandiggy.poe4j.data.rows.gen;

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
    private NPCMaster nPCMasterKey;
    @Order(1)
    private Integer masterLevel;
    @Order(2)
    private Integer experience;
    @Order(3)
    private Integer itemLevel;
    @Order(4)
    private Integer unknown5;
    @Order(5)
    private Integer unknown6;

}
