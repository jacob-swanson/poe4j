
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
public class ExplodingStormBuffs
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private BuffDefinitions BuffDefinitionsKey1;
    @Order(2)
    private Long Key0;
    @Order(3)
    private List<Integer> StatValues;
    @Order(4)
    private int Unknown7;
    @Order(5)
    private List<Integer> Data1;
    @Order(6)
    private int Unknown10;
    @Order(7)
    private int Unknown11;
    @Order(8)
    private int Unknown12;
    @Order(9)
    private MonsterVarieties Friendly_MonsterVarietiesKey;
    @Order(10)
    private MiscObjects MiscObjectsKey;
    @Order(11)
    private MiscAnimated MiscAnimatedKey;
    @Order(12)
    private BuffVisuals BuffVisualsKey;
    @Order(13)
    private MonsterVarieties Enemy_MonsterVarietiesKey;
    @Order(14)
    private int Unknown23;
    @Order(15)
    private int Unknown24;
    @Order(16)
    private int Unknown25;
    @Order(17)
    private BuffDefinitions BuffDefinitionsKey2;

}
