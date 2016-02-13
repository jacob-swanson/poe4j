
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
public class Bloodlines
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private List<Mods> ModsKeys;
    @Order(2)
    private int MinZoneLevel;
    @Order(3)
    private int MaxZoneLevel;
    @Order(4)
    private List<Tags> SpawnWeight_TagsKeys;
    @Order(5)
    private List<Integer> SpawnWeight_Values;
    @Order(6)
    private int Unknown8;
    @Order(7)
    private BuffDefinitions BuffDefinitionsKey;
    @Order(8)
    private List<Integer> Unknown11;
    @Order(9)
    private List<Tags> ItemWeight_TagsKeys;
    @Order(10)
    private List<Integer> ItemWeight_Values;
    @Order(11)
    private MonsterVarieties MonsterVarietiesKey;
    @Order(12)
    private int Unknown20;
    @Order(13)
    private Boolean Flag0;
    @Order(14)
    private List<Long> Keys2;
    @Order(15)
    private Boolean Flag1;

}
