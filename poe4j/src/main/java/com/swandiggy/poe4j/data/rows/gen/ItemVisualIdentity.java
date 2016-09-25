
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemVisualIdentity")
public class ItemVisualIdentity
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String dDSFile;
    @Order(2)
    private String aOFile;
    @Order(3)
    private SoundEffects soundEffectsKey;
    @Order(4)
    private Integer unknownUniqueInt;
    @Order(5)
    private String fMTFile;
    @Order(6)
    private String marauderSMFile;
    @Order(7)
    private String rangerSMFile;
    @Order(8)
    private String witchSMFile;
    @Order(9)
    private String duelistDexSMFile;
    @Order(10)
    private String templarSMFile;
    @Order(11)
    private String shadowSMFile;
    @Order(12)
    private String scionSMFile;
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
    private Integer unknown17;
    @Order(21)
    private Integer unknown18;
    @Order(22)
    private List<AchievementItem> pickup_AchievementItemsKeys;
    @Order(23)
    private String unknownSMFile2;
    @Order(24)
    private List<AchievementItem> identify_AchievementItemsKeys;
    @Order(25)
    private String ePKFile;
    @Order(26)
    private List<AchievementItem> corrupt_AchievementItemsKeys;

}
