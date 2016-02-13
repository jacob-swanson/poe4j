
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
public class ItemVisualIdentity
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String IDTFile;
    @Order(2)
    private String AOFile;
    @Order(3)
    private Long Key0;
    @Order(4)
    private int Unknown1;
    @Order(5)
    private String FMTFile;
    @Order(6)
    private String MarauderSMFile;
    @Order(7)
    private String RangerSMFile;
    @Order(8)
    private String WitchSMFile;
    @Order(9)
    private String DuelistDexSMFile;
    @Order(10)
    private String TemplarSMFile;
    @Order(11)
    private String ShadowSMFile;
    @Order(12)
    private String ScionSMFile;
    @Order(13)
    private String MarauderShape;
    @Order(14)
    private String RangerShape;
    @Order(15)
    private String WitchShape;
    @Order(16)
    private String DuelistShape;
    @Order(17)
    private String TemplarShape;
    @Order(18)
    private String ShadowShape;
    @Order(19)
    private String ScionShape;
    @Order(20)
    private int Unknown17;
    @Order(21)
    private int Unknown18;
    @Order(22)
    private int Unknown19;
    @Order(23)
    private String UnknownSMFile1;
    @Order(24)
    private String UnknownSMFile2;
    @Order(25)
    private int Unknown22;
    @Order(26)
    private String Unknown23;
    @Order(27)
    private String EPKFile;
    @Order(28)
    private List<Integer> Data0;

}
