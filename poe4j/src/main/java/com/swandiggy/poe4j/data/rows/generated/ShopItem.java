
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
@DatFile("ShopItem")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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
    private List<ShopItem> packageShopItem;
    @Order(4)
    private Boolean flag0;
    @Order(5)
    private List<Integer> packageValues;
    @Order(6)
    private List<ShopCategory> shopCategory;
    @Order(7)
    private String artJPGFile;
    @Order(8)
    private Long key0;
    @Order(9)
    private String youtubeVideo;
    @Order(10)
    private String largeArtJpgFile;
    @Order(11)
    private String description2;
    @Order(12)
    private String dailyDealArtPath;
    @Order(13)
    private int unknown2;

}
