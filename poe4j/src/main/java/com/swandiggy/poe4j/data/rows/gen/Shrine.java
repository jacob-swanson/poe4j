
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Shrines")
public class Shrine
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer unknown0;
    @Order(2)
    private String name;
    @Order(3)
    private Boolean chargesShared;
    @Order(4)
    private ShrineBuff player_ShrineBuffsKey;
    @Order(5)
    private Integer unknown4;
    @Order(6)
    private Integer unknown5;
    @Order(7)
    private String description;
    @Order(8)
    private ShrineBuff monster_ShrineBuffsKey;
    @Order(9)
    private MonsterVarieties summonMonster_MonsterVarietiesKey;
    @Order(10)
    private MonsterVarieties summonPlayer_MonsterVarietiesKey;
    @Order(11)
    private Integer unknown10;
    @Order(12)
    private Integer unknown11;
    @Order(13)
    private ShrineSound shrineSoundsKey;
    @Order(14)
    private Boolean unknown14;
    @Order(15)
    private List<AchievementItem> achievementItemsKeys;
    @Order(16)
    private Boolean unknown16;

}
