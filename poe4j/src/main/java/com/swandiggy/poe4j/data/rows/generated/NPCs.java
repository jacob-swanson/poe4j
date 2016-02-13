
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
public class NPCs
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Name;
    @Order(2)
    private int Unknown2;
    @Order(3)
    private List<Integer> SoldItem_Weights;
    @Order(4)
    private List<Tags> SoldItem_TagsKeys;
    @Order(5)
    private int Unknown7;
    @Order(6)
    private List<Long> Data0_Keys0;
    @Order(7)
    private List<Integer> Data0_Values;
    @Order(8)
    private List<Long> Keys1;
    @Order(9)
    private List<String> GreetingAudioFiles;
    @Order(10)
    private String InheritsFrom;
    @Order(11)
    private List<String> FarewellAudioFiles;
    @Order(12)
    private int Unknown19;
    @Order(13)
    private NPCMaster NPCMasterKey;
    @Order(14)
    private String NameShort;
    @Order(15)
    private int Unknown11;
    @Order(16)
    private int Unknown12;

}
