
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
@DatFile("NPCMaster")
public class NPCMaster
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    @ReferenceOne("id")
    private NPC nPC;
    @Order(2)
    private Boolean isStrMaster;
    @Order(3)
    private Boolean isDexMaster;
    @Order(4)
    private Mods signatureModMod;
    @Order(5)
    private Boolean isIntMaster;
    @Order(6)
    private String hideout;
    @Order(7)
    private List<Long> keys0;
    @Order(8)
    private int unknown7;
    @Order(9)
    private Long key1;
    @Order(10)
    private List<Tags> signatureModSpawnWeightTags;
    @Order(11)
    private List<Integer> signatureModSpawnWeightValue;
    @Order(12)
    private List<Long> keys1;
    @Order(13)
    private List<Integer> data4;
    @Order(14)
    private Long key2;
    @Order(15)
    private Long key3;

}
