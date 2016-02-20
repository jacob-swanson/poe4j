
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemVisualIdentity")
public class ItemVisualIdentity
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String iDTFile;
    @Order(2)
    private String aOFile;
    @Order(3)
    private Long key0;
    @Order(4)
    private int unknown1;
    @Order(5)
    private String fMTFile;
    @Order(6)
    private String marauderSMFile;
    @Order(7)
    private String rangerSMFile;
    @Order(8)
    private String witchSMFile;
    @Order(9)
    private String duelistDexSMFile;
    @Order(10)
    private String templarSMFile;
    @Order(11)
    private String shadowSMFile;
    @Order(12)
    private String scionSMFile;
    @Order(13)
    private String marauderShape;
    @Order(14)
    private String rangerShape;
    @Order(15)
    private String witchShape;
    @Order(16)
    private String duelistShape;
    @Order(17)
    private String templarShape;
    @Order(18)
    private String shadowShape;
    @Order(19)
    private String scionShape;
    @Order(20)
    private int unknown17;
    @Order(21)
    private int unknown18;
    @Order(22)
    private int unknown19;
    @Order(23)
    private String unknownSMFile1;
    @Order(24)
    private String unknownSMFile2;
    @Order(25)
    private int unknown22;
    @Order(26)
    private String unknown23;
    @Order(27)
    private String ePKFile;
    @Order(28)
    private List<Integer> data0;

}
