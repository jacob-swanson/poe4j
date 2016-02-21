
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthSecretEffects")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class LabyrinthSecretEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private MonsterVariety monsterVariety;
    @Order(2)
    private MonsterPack monsterPack;
    @Order(3)
    private Boolean flag0;
    @Order(4)
    private BuffDefinition buffBuffDefinition;
    @Order(5)
    private List<Integer> buffValue;
    @Order(6)
    private Boolean flag1;
    @Order(7)
    private String oTFile;
    @Order(8)
    private Boolean flag2;

}
