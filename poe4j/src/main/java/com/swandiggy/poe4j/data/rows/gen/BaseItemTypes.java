
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BaseItemTypes")
public class BaseItemTypes
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private ItemClasses itemClassesKey;
    @Order(2)
    private Integer width;
    @Order(3)
    private Integer height;
    @Order(4)
    private String name;
    @Order(5)
    private String inheritsFrom;
    @Order(6)
    private Integer dropLevel;
    @Order(7)
    private FlavourText flavourTextKey;
    @Order(8)
    private List<Mods> implicit_ModsKeys;
    @Order(9)
    private Integer unknown1;
    @Order(10)
    private SoundEffects soundEffectsKey;
    @Order(11)
    private List<Integer> data1;
    @Order(12)
    private List<Integer> data2;
    @Order(13)
    private List<Integer> data3;
    @Order(14)
    private List<Integer> data4;
    @Order(15)
    private List<Tags> tagsKeys;
    @Order(16)
    private Integer unknown2;
    @Order(17)
    private ItemVisualIdentity itemVisualIdentityKey;
    @Order(18)
    private Integer unknownUnique;
    @Order(19)
    private List<AchievementItem> vendorRecipe_AchievementItemsKeys;
    @Order(20)
    private List<Integer> data7;
    @Order(21)
    private List<Integer> data8;
    @Order(22)
    private List<Integer> data9;
    @Order(23)
    private List<Integer> data10;
    @Order(24)
    private String unknown20;
    @Order(25)
    private AchievementItem equip_AchievementItemsKey;
    @Order(26)
    private Boolean isTalisman;
    @Order(27)
    private List<Integer> data11;

}
