
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
public class WarbandsPackMonsters
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Long Unknown1;
    @Order(2)
    private int Unknown3;
    @Order(3)
    private List<MonsterVarieties> Tier4_MonsterVarietiesKeys;
    @Order(4)
    private List<MonsterVarieties> Tier3_MonsterVarietiesKeys;
    @Order(5)
    private List<MonsterVarieties> Tier2_MonsterVarietiesKeys;
    @Order(6)
    private List<MonsterVarieties> Tier1_MonsterVarietiesKeys;
    @Order(7)
    private String Tier1Name;
    @Order(8)
    private String Tier2Name;
    @Order(9)
    private String Tier3Name;
    @Order(10)
    private String Tier4Name;
    @Order(11)
    private String Tier1Art;
    @Order(12)
    private String Tier2Art;
    @Order(13)
    private String Tier3Art;
    @Order(14)
    private String Tier4Art;

}
