
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.ReferenceOne;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class NPCMaster
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    @ReferenceOne("Id")
    private NPCs NPCsKey;
    @Order(2)
    private Boolean IsStrMaster;
    @Order(3)
    private Boolean IsDexMaster;
    @Order(4)
    private Mods SignatureMod_ModsKey;
    @Order(5)
    private Boolean IsIntMaster;
    @Order(6)
    private String Hideout;
    @Order(7)
    private List<Long> Keys0;
    @Order(8)
    private int Unknown7;
    @Order(9)
    private Long Key1;
    @Order(10)
    private List<Tags> SignatureModSpawnWeight_TagsKeys;
    @Order(11)
    private List<Integer> SignatureModSpawnWeight_Values;
    @Order(12)
    private List<Long> Keys1;
    @Order(13)
    private List<Integer> Data4;
    @Order(14)
    private Long Key2;
    @Order(15)
    private Long Key3;

}
