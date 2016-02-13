
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ShopItem
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Name;
    @Order(2)
    private String Description;
    @Order(3)
    private List<ShopItem> Package_ShopItemKeys;
    @Order(4)
    private Boolean Flag0;
    @Order(5)
    private List<Integer> Package_Values;
    @Order(6)
    private List<ShopCategory> ShopCategoryKeys;
    @Order(7)
    private String ArtJPGFile;
    @Order(8)
    private Long Key0;
    @Order(9)
    private String YoutubeVideo;
    @Order(10)
    private String LargeArtJPGFile;
    @Order(11)
    private String Description2;
    @Order(12)
    private String DailyDealArtPath;
    @Order(13)
    private int Unknown2;

}
