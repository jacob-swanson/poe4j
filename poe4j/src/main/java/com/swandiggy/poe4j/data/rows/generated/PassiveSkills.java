
package com.swandiggy.poe4j.data.rows.generated;

import java.lang.*;
import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("PassiveSkills")
public class PassiveSkills
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String icon;
    @Order(2)
    private List<Stats> stats;
    @Order(3)
    private int stat1Value;
    @Order(4)
    private int stat2Value;
    @Order(5)
    private int stat3Value;
    @Order(6)
    private int stat4Value;
    @Order(7)
    private int passiveSkillGraphId;
    @Order(8)
    private String name;
    @Order(9)
    private List<Character> characters;
    @Order(10)
    private Boolean isKeystone;
    @Order(11)
    private Boolean isNotable;
    @Order(12)
    private String flavourText;
    @Order(13)
    private Boolean isJustIcon;
    @Order(14)
    private Long key0;
    @Order(15)
    private Boolean isJewelSocket;
    @Order(16)
    private Long key1;
    @Order(17)
    private Long key2;
    @Order(18)
    private int unknown5;
    @Order(19)
    private List<Integer> unknown6;
    @Order(20)
    private Long key3;
    @Order(21)
    private Byte unknown10;

}
