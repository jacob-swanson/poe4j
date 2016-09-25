
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("WarbandsPackMonsters")
public class WarbandsPackMonster
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Long unknown1;
    @Order(2)
    private Integer unknown3;
    @Order(3)
    private List<MonsterVarieties> tier4_MonsterVarietiesKeys;
    @Order(4)
    private List<MonsterVarieties> tier3_MonsterVarietiesKeys;
    @Order(5)
    private List<MonsterVarieties> tier2_MonsterVarietiesKeys;
    @Order(6)
    private List<MonsterVarieties> tier1_MonsterVarietiesKeys;
    @Order(7)
    private String tier1Name;
    @Order(8)
    private String tier2Name;
    @Order(9)
    private String tier3Name;
    @Order(10)
    private String tier4Name;
    @Order(11)
    private String tier1Art;
    @Order(12)
    private String tier2Art;
    @Order(13)
    private String tier3Art;
    @Order(14)
    private String tier4Art;

}
