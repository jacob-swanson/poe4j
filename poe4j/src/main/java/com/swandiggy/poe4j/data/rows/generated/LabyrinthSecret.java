
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
@DatFile("LabyrinthSecrets")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class LabyrinthSecret
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String id2;
    @Order(2)
    private List<Integer> data0;
    @Order(3)
    private int unknown5;
    @Order(4)
    private int unknown6;
    @Order(5)
    private List<LabyrinthSecretEffect> labyrinthSecretEffectsKeys0;
    @Order(6)
    private List<LabyrinthSecretEffect> labyrinthSecretEffectsKeys1;
    @Order(7)
    private List<LabyrinthSecretEffect> labyrinthSecretEffectsKeys2;
    @Order(8)
    private int unknown13;
    @Order(9)
    private List<LabyrinthSecretEffect> labyrinthSecretEffectsKeys3;
    @Order(10)
    private Byte flag0;
    @Order(11)
    private Byte flag1;
    @Order(12)
    private String unknown0;
    @Order(13)
    private Byte flag2;
    @Order(14)
    private Byte flag3;
    @Order(15)
    private Byte flag4;
    @Order(16)
    private String name;
    @Order(17)
    private AchievementItem achievement;
    
}
