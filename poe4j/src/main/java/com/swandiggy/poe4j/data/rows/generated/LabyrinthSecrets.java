
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
public class LabyrinthSecrets
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Id2;
    @Order(2)
    private List<Integer> Data0;
    @Order(3)
    private int Unknown5;
    @Order(4)
    private int Unknown6;
    @Order(5)
    private List<LabyrinthSecretEffects> LabyrinthSecretEffectsKeys0;
    @Order(6)
    private List<LabyrinthSecretEffects> LabyrinthSecretEffectsKeys1;
    @Order(7)
    private List<LabyrinthSecretEffects> LabyrinthSecretEffectsKeys2;
    @Order(8)
    private int Unknown13;
    @Order(9)
    private List<LabyrinthSecretEffects> LabyrinthSecretEffectsKeys3;
    @Order(10)
    private Byte Flag0;
    @Order(11)
    private Byte Flag1;
    @Order(12)
    private String Index0;
    @Order(13)
    private int Unknown17;

}
