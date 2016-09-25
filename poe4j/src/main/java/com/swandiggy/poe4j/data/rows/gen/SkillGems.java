
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SkillGems")
public class SkillGems
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private GrantedEffect grantedEffectsKey;
    @Order(2)
    private Integer str;
    @Order(3)
    private Integer dex;
    @Order(4)
    private Integer intelligence;
    @Order(5)
    private List<GemTag> gemTagsKeys;
    @Order(6)
    private Long key1;
    @Order(7)
    private Boolean flag0;

}
