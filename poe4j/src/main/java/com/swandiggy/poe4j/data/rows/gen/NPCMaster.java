
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCMaster")
public class NPCMaster
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    @ReferenceOne("id")
    private NPCs nPCsKey;
    @Order(2)
    private Boolean isStrMaster;
    @Order(3)
    private Boolean isDexMaster;
    @Order(4)
    private Mods signatureMod_ModsKey;
    @Order(5)
    private Boolean isIntMaster;
    @Order(6)
    @ReferenceOne("id")
    private NPCs hideout;
    @Order(7)
    private List<Long> keys0;
    @Order(8)
    private Integer unknown7;
    @Order(9)
    private AchievementItem achievementItemsKey;
    @Order(10)
    private List<Tags> signatureModSpawnWeight_TagsKeys;
    @Order(11)
    private List<Integer> signatureModSpawnWeight_Values;
    @Order(12)
    private List<Tags> unknownWeight_TagsKeys;
    @Order(13)
    private List<Integer> unknownWeight_Values;
    @Order(14)
    private Long key2;
    @Order(15)
    private AchievementItem talisman_AchievementItemsKey;
    @Order(16)
    private List<AchievementItem> masterLevel5_AchievementItemsKeys;

}
