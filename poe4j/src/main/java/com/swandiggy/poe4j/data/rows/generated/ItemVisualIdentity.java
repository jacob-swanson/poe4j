
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemVisualIdentity")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ItemVisualIdentity
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String ddsFile;
    @Order(2)
    private String aoFile;
    @Order(3)
    private SoundEffect soundEffect;
    @Order(4)
    private int unknown1;
    @Order(5)
    private String fmtFile;
    @Order(6)
    private String marauderSmFile;
    @Order(7)
    private String rangerSmFile;
    @Order(8)
    private String witchSmFile;
    @Order(9)
    private String duelistDexSmFile;
    @Order(10)
    private String templarSmFile;
    @Order(11)
    private String shadowSmFile;
    @Order(12)
    private String scionSmFile;
    @Order(13)
    private String marauderShape;
    @Order(14)
    private String rangerShape;
    @Order(15)
    private String witchShape;
    @Order(16)
    private String duelistShape;
    @Order(17)
    private String templarShape;
    @Order(18)
    private String shadowShape;
    @Order(19)
    private String scionShape;
    @Order(20)
    private int unknown17;
    @Order(21)
    private int unknown18;
    @Order(22)
    private AchievementItem pickupAchievement;
    @Order(23)
    private String unknownSmFile1;
    @Order(24)
    private AchievementItem identifyAchievement;
    @Order(27)
    private String epkFile;
    @Order(28)
    private List<AchievementItem> corruptAchievements;

}
