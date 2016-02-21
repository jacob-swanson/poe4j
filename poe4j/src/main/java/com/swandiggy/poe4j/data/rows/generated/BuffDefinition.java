
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
@DatFile("BuffDefinitions")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BuffDefinition
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    private Boolean invisible;
    @Order(3)
    private Boolean removable;
    @Order(4)
    private String name;
    @Order(5)
    private List<Stats> stats;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private int unknown2;
    @Order(8)
    private Boolean flag1;
    @Order(9)
    private Long key0;
    @Order(10)
    private Long key1;
    @Order(11)
    private Boolean flag2;
    @Order(12)
    private int unknown5;
    @Order(13)
    private BuffVisual buffVisual;
    @Order(14)
    private Boolean flag3;
    @Order(15)
    private Boolean flag4;
    @Order(16)
    private int unknown7;
    @Order(17)
    private Boolean flag5;
    @Order(18)
    private Boolean flag6;
    @Order(19)
    private Boolean flag7;
    @Order(20)
    private Boolean flag8;
    @Order(21)
    private Boolean flag9;
    @Order(22)
    private int buffLimit;

}
