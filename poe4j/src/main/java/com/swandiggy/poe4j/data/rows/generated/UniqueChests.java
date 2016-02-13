
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
public class UniqueChests
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Chests ChestsKey;
    @Order(2)
    private Words WordsKey;
    @Order(3)
    private FlavourText FlavourTextKey;
    @Order(4)
    private int Unknown6;
    @Order(5)
    private List<Mods> ModsKeys;
    @Order(6)
    private int Unknown9;
    @Order(7)
    private List<Integer> Data1;
    @Order(8)
    private String AOFile;
    @Order(9)
    private Boolean Flag0;
    @Order(10)
    private List<Integer> Data2;
    @Order(11)
    private Long Key0;

}
