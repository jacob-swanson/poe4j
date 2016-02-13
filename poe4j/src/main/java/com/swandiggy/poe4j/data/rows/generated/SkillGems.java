
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
public class SkillGems
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes BaseItemTypesKey;
    @Order(1)
    private GrantedEffects GrantedEffectsKey;
    @Order(2)
    private int Str;
    @Order(3)
    private int Dex;
    @Order(4)
    private int Int;
    @Order(5)
    private List<GemTags> GemTagsKeys;
    @Order(6)
    private Long Key1;
    @Order(7)
    private Boolean Flag0;

}
