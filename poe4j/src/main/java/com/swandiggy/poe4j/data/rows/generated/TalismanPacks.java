
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
public class TalismanPacks
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private List<MonsterPacks> MonsterPacksKeys;
    @Order(2)
    private int Unknown4;
    @Order(3)
    private int Unknown5;
    @Order(4)
    private MonsterVarieties MonsterVarietiesKey;
    @Order(5)
    private int Unknown8;
    @Order(6)
    private int Unknown9;
    @Order(7)
    private int Unknown10;
    @Order(8)
    private int Unknown11;
    @Order(9)
    private MonsterPacks MonsterPacksKey;

}
