
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
@DatFile("Chests")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Chest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Boolean flag0;
    @Order(2)
    private int unknown0;
    @Order(3)
    private String name;
    @Order(4)
    private String aOFile;
    @Order(5)
    private Boolean flag1;
    @Order(6)
    private Boolean flag2;
    @Order(7)
    private int unknown1;
    @Order(8)
    private Boolean flag3;
    @Order(9)
    private Boolean flag4;
    @Order(10)
    private int unknown2;
    @Order(11)
    private List<Long> unknownKeys0;
    @Order(12)
    private List<Integer> unknownValues;
    @Order(13)
    private BaseItemType baseItemType;
    @Order(14)
    private Boolean flag5;
    @Order(15)
    private List<Mods> mods;
    @Order(16)
    private Boolean isStrongbox;
    @Order(17)
    private List<Tags> tags;
    @Order(18)
    private Long key0;
    @Order(19)
    private int unknown4;
    @Order(20)
    private Boolean isQuestChest;
    @Order(21)
    private int minLevel;
    @Order(22)
    private String unknown6;
    @Order(23)
    private int unknown7;
    @Order(24)
    private String unknown8;
    @Order(25)
    private int spawnChance;
    @Order(26)
    private int unknown10;
    @Order(27)
    private int unknown11;

}
