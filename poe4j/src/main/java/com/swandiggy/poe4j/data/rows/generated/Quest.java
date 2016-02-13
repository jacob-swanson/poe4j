
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Quest
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int Act;
    @Order(2)
    private String Title;
    @Order(3)
    private int QuestState;
    @Order(4)
    private String QuestIcon;
    @Order(5)
    private int QuestId;
    @Order(6)
    private Boolean Flag0;
    @Order(7)
    private Byte Unknown6;
    @Order(8)
    private Boolean IsQuest;
    @Order(9)
    private Byte Unknown8;
    @Order(10)
    private Byte Unknown9;
    @Order(11)
    private Byte Unknown10;
    @Order(12)
    private int Unknown11;

}
