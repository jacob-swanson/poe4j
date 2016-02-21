
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
@DatFile("ExplodingStormBuffs")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ExplodingStormBuff
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private BuffDefinition buffDefinition1;
    @Order(2)
    private Long key0;
    @Order(3)
    private List<Integer> statValues;
    @Order(4)
    private int unknown7;
    @Order(5)
    private List<Integer> data1;
    @Order(6)
    private int unknown10;
    @Order(7)
    private int unknown11;
    @Order(8)
    private int unknown12;
    @Order(9)
    private MonsterVariety friendlyMonsterVariety;
    @Order(10)
    private MiscObject miscObject;
    @Order(11)
    private MiscAnimated miscAnimated;
    @Order(12)
    private BuffVisual buffVisual;
    @Order(13)
    private MonsterVariety enemyMonsterVariety;
    @Order(14)
    private int unknown23;
    @Order(15)
    private int unknown24;
    @Order(16)
    private int unknown25;
    @Order(17)
    private BuffDefinition buffDefinition2;

}
