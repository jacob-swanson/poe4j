
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
public class ActiveSkills
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String DisplayedName;
    @Order(2)
    private String Description;
    @Order(3)
    private String Index3;
    @Order(4)
    private String IconPath;
    @Order(5)
    private List<Integer> ActiveSkillTargetTypeData;
    @Order(6)
    private int CastTime;
    @Order(7)
    private List<Integer> ActiveSkillTypeData;
    @Order(8)
    private List<Integer> Data2;
    @Order(9)
    private String WebsiteDescription;
    @Order(10)
    private String WebsiteImage;
    @Order(11)
    private Boolean Flag0;
    @Order(12)
    private GrantedEffects GrantedEffectsKey;
    @Order(13)
    private Boolean Flag1;
    @Order(14)
    private int Unknown4;
    @Order(15)
    private Boolean Flag3;

}
