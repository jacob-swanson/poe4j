
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
@DatFile("ActiveSkills")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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
    private String iconPath;
    @Order(5)
    private List<Integer> activeSkillTargetTypeData;
    @Order(6)
    private int castTime;
    @Order(7)
    private List<Integer> activeSkillTypeData;
    @Order(8)
    private List<Integer> data2;
    @Order(9)
    private String websiteDescription;
    @Order(10)
    private String websiteImage;
    @Order(11)
    private Boolean flag0;
    @Order(12)
    private GrantedEffect grantedEffect;
    @Order(13)
    private Boolean flag1;
    @Order(14)
    private int unknown4;
    @Order(15)
    private Boolean flag3;

}
