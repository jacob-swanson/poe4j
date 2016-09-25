
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ActiveSkills")
public class ActiveSkill
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String displayedName;
    @Order(2)
    private String description;
    @Order(3)
    private String index3;
    @Order(4)
    private String icon_DDSFile;
    @Order(5)
    private List<Integer> activeSkillTargetTypeData;
    @Order(6)
    private List<Integer> activeSkillTypeData;
    @Order(7)
    private List<ItemClasses> weaponRestriction_ItemClassesKeys;
    @Order(8)
    private String websiteDescription;
    @Order(9)
    private String websiteImage;
    @Order(10)
    private Boolean flag0;
    @Order(11)
    private String unknown13;
    @Order(12)
    private Boolean flag1;
    @Order(13)
    private Integer skillTotemId;
    @Order(14)
    private Boolean isManuallyCasted;
    @Order(15)
    private List<Stats> input_StatKeys;
    @Order(16)
    private List<Stats> output_StatKeys;
    @Order(17)
    private List<Integer> unknown19;

}
