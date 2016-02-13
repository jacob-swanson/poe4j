
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
public class Chests
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Boolean Flag0;
    @Order(2)
    private int Unknown0;
    @Order(3)
    private String Name;
    @Order(4)
    private String AOFile;
    @Order(5)
    private Boolean Flag1;
    @Order(6)
    private Boolean Flag2;
    @Order(7)
    private int Unknown1;
    @Order(8)
    private Boolean Flag3;
    @Order(9)
    private Boolean Flag4;
    @Order(10)
    private int Unknown2;
    @Order(11)
    private List<Long> Unknown_Keys0;
    @Order(12)
    private List<Integer> Unknown_Values;
    @Order(13)
    private BaseItemTypes BaseItemTypesKey;
    @Order(14)
    private Boolean Flag5;
    @Order(15)
    private List<Mods> ModsKeys;
    @Order(16)
    private Boolean IsStrongbox;
    @Order(17)
    private List<Tags> TagsKeys;
    @Order(18)
    private Long Key0;
    @Order(19)
    private int Unknown4;
    @Order(20)
    private Boolean IsQuestChest;
    @Order(21)
    private int MinLevel;
    @Order(22)
    private String Unknown6;
    @Order(23)
    private int Unknown7;
    @Order(24)
    private String Unknown8;
    @Order(25)
    private int SpawnChance;
    @Order(26)
    private int Unknown10;
    @Order(27)
    private int Unknown11;

}
