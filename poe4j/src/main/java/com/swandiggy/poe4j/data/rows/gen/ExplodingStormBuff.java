
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ExplodingStormBuffs")
public class ExplodingStormBuff
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private BuffDefinitions buffDefinitionsKey1;
    @Order(2)
    private Long key0;
    @Order(3)
    private List<Integer> statValues;
    @Order(4)
    private Integer unknown7;
    @Order(5)
    private List<Integer> data1;
    @Order(6)
    private Integer unknown10;
    @Order(7)
    private Integer unknown11;
    @Order(8)
    private Integer unknown12;
    @Order(9)
    private MonsterVarieties friendly_MonsterVarietiesKey;
    @Order(10)
    private MiscObjects miscObjectsKey;
    @Order(11)
    private MiscAnimated miscAnimatedKey;
    @Order(12)
    private BuffVisuals buffVisualsKey;
    @Order(13)
    private MonsterVarieties enemy_MonsterVarietiesKey;
    @Order(14)
    private Integer unknown23;
    @Order(15)
    private Integer unknown24;
    @Order(16)
    private Integer unknown25;
    @Order(17)
    private BuffDefinitions buffDefinitionsKey2;

}
