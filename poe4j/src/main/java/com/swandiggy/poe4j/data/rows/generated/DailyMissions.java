
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class DailyMissions
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int Unknown0;
    @Order(2)
    private int Unknown1;
    @Order(3)
    private int Unknown2;
    @Order(4)
    private int SpawnWeight;
    @Order(5)
    private String Description;
    @Order(6)
    private NPCTalk NPCTalkKey;
    @Order(7)
    private List<Characters> CharactersKeys;
    @Order(8)
    private int Unknown8;
    @Order(9)
    @Reference(value = Integer.class, offset = 1L)
    private PVPTypes PVPTypesKey;

}
