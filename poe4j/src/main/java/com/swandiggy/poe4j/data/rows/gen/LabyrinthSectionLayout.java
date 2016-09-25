
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthSectionLayout")
public class LabyrinthSectionLayout
    extends BaseRow
{

    @Order(0)
    private LabyrinthSection labyrinthSectionKey;
    @Order(1)
    private Integer unknown3;
    @Order(2)
    private List<LabyrinthSectionLayout> labyrinthSectionLayoutKeys;
    @Order(3)
    private LabyrinthSecret labyrinthSecretsKey0;
    @Order(4)
    private LabyrinthSecret labyrinthSecretsKey1;
    @Order(5)
    private LabyrinthArea labyrinthAreasKey;
    @Order(6)
    private Integer flags1;
    @Order(7)
    private Integer flags2;
    @Order(8)
    private LabyrinthNodeOverride labyrinthNodeOverridesKey;

}
