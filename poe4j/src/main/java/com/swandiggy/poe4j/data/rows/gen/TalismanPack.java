
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("TalismanPacks")
public class TalismanPack
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<MonsterPacks> monsterPacksKeys;
    @Order(2)
    private Integer unknown4;
    @Order(3)
    private Integer unknown5;
    @Order(4)
    private MonsterVarieties monsterVarietiesKey;
    @Order(5)
    private Integer unknown8;
    @Order(6)
    private Integer unknown9;
    @Order(7)
    private Integer unknown10;
    @Order(8)
    private Integer unknown11;
    @Order(9)
    private MonsterPacks monsterPacksKey;

}
