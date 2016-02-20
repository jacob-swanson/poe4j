
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SkillGems")
public class SkillGems
    extends BaseRow
{

    @Order(0)
    private BaseItemType baseItemType;
    @Order(1)
    private GrantedEffect grantedEffect;
    @Order(2)
    private int strength;
    @Order(3)
    private int dexterity;
    @Order(4)
    private int intelligence;
    @Order(5)
    private List<GemTag> gemTags;
    @Order(6)
    private Long key1;
    @Order(7)
    private Boolean flag0;

}
