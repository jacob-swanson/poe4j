
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("UniqueChests")
public class UniqueChest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Chests chestsKey;
    @Order(2)
    private Words wordsKey;
    @Order(3)
    private FlavourText flavourTextKey;
    @Order(4)
    private Integer unknown6;
    @Order(5)
    private List<Mods> modsKeys;
    @Order(6)
    private Integer unknown9;
    @Order(7)
    private List<Integer> data1;
    @Order(8)
    private String aOFile;
    @Order(9)
    private Boolean flag0;
    @Order(10)
    private List<Integer> data2;
    @Order(11)
    private Long key0;

}
