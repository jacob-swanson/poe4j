
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
@DatFile("DaressoPitFights")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class DaressoPitFight
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Long key0;
    @Order(2)
    private int unknown1;
    @Order(3)
    private List<Integer> unknown2;
    @Order(4)
    private Boolean flagUnknown0;
    @Order(5)
    private Boolean flagUnknown2;
    @Order(6)
    private int unknown3;
    @Order(7)
    private int unknown4;
    @Order(8)
    private int unknown6;
    @Order(9)
    private Boolean flagUnknown3;

}
