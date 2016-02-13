
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
public class BaseItemTypes
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private ItemClasses ItemClassesKey;
    @Order(2)
    private int Width;
    @Order(3)
    private int Height;
    @Order(4)
    private String Name;
    @Order(5)
    private String InheritsFrom;
    @Order(6)
    private int DropLevel;
    @Order(7)
    private FlavourText FlavourTextKey;
    @Order(8)
    private List<Mods> Implicit_ModsKeys;
    @Order(9)
    private int Unknown5;
    @Order(10)
    private SoundEffects SoundEffectsKey;
    @Order(11)
    private List<Integer> Data1;
    @Order(12)
    private List<Integer> Data2;
    @Order(13)
    private List<Integer> Data3;
    @Order(14)
    private List<Integer> Data4;
    @Order(15)
    private List<Tags> TagsKeys;
    @Order(16)
    private int Unknown14;
    @Order(17)
    private ItemVisualIdentity ItemVisualIdentityKey;
    @Order(18)
    private Integer Unknown17;
    @Order(19)
    private Long Key1;
    @Order(20)
    private List<Integer> Data7;
    @Order(21)
    private List<Integer> Data8;
    @Order(22)
    private List<Integer> Data9;
    @Order(23)
    private List<Integer> Data10;
    @Order(24)
    private String Unknown20;
    @Order(25)
    private Long Key2;
    @Order(26)
    private Byte Unknown21;

}
