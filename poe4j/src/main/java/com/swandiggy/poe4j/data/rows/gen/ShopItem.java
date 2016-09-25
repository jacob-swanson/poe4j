
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ShopItem")
public class ShopItem
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private String description;
    @Order(3)
    private List<ShopItem> package_ShopItemKeys;
    @Order(4)
    private List<Integer> package_Values;
    @Order(5)
    private List<ShopCategory> shopCategoryKeys;
    @Order(6)
    private String smallArt_JPGFile;
    @Order(7)
    private String youtubeVideo;
    @Order(8)
    private String unknown11;
    @Order(9)
    private String largeArt_JPGFile;
    @Order(10)
    private String description2;
    @Order(11)
    private String dailyDealArt_JPGFile;
    @Order(12)
    private Integer unknown15;
    @Order(13)
    private Boolean flag0;

}
