
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
    private List<Integer> activeSkillTypeData;
    @Order(7)
    private List<ItemClass> weaponRestrictions;
    @Order(9)
    private String websiteDescription;
    @Order(10)
    private String websiteImage;
    @Order(11)
    private Boolean flag0;
    @Order(12)
    private String unknown13;
    @Order(13)
    private Boolean flag1;
    /**
     * Links to SkillTotem, but may exceed number of entries; in that case it is a player skill.
     */
    @Order(14)
    private Integer skillTotemId;
    @Order(15)
    private Boolean isManuallyCasted;
    /**
     * Stats that will modify this skill specifically
     */
    @Order(16)
    private List<Stat> inputStats;
    /**
     * Stat an input stat will be transformed into
     */
    @Order(17)
    private List<Stat> outputStats;
    @Order(18)
    private List<Integer> unknown19;

}
