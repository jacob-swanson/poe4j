
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
@DatFile("BaseItemTypes")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BaseItemType
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private ItemClass itemClass;
    @Order(2)
    private int width;
    @Order(3)
    private int height;
    @Order(4)
    private String name;
    @Order(5)
    private String inheritsFrom;
    @Order(6)
    private int dropLevel;
    @Order(7)
    private FlavourText flavourText;
    @Order(8)
    private List<Mods> implicitMods;
    @Order(9)
    private int unknown5;
    @Order(10)
    private SoundEffect soundEffect;
    @Order(11)
    private List<Integer> data1;
    @Order(12)
    private List<Integer> data2;
    @Order(13)
    private List<Integer> data3;
    @Order(14)
    private List<Integer> data4;
    @Order(15)
    private List<Tags> tags;
    @Order(16)
    private int unknown14;
    @Order(17)
    private ItemVisualIdentity itemVisualIdentity;
    @Order(18)
    private Integer unknown17;
    @Order(19)
    private AchievementItem vendorRecipeAchievement;
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
    private AchievementItem equipAchievement;
    @Order(26)
    private Boolean isTalisman;
    @Order(27)
    private List<Integer> data1;

}
