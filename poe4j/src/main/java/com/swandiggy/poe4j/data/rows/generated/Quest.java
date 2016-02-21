
package com.swandiggy.poe4j.data.rows.generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Quest")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Quest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int act;
    @Order(2)
    private String title;
    @Order(3)
    private int questState;
    @Order(4)
    private String questIcon;
    @Order(5)
    private int questId;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private Byte unknown6;
    @Order(8)
    private Boolean isQuest;
    @Order(9)
    private Byte unknown8;
    @Order(10)
    private Byte unknown9;
    @Order(11)
    private Byte unknown10;
    @Order(12)
    private int unknown11;

}
