
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestStates")
public class QuestState
    extends BaseRow
{

    @Order(0)
    private Quest quest;
    @Order(1)
    private int unknown2;
    @Order(2)
    private List<Integer> questState;
    @Order(3)
    private List<Integer> data1;
    @Order(4)
    private String text;
    @Order(5)
    private Boolean flag0;
    @Order(6)
    private String message;
    @Order(7)
    private List<Long> data2;
    @Order(8)
    private int unknown9;
    @Order(9)
    private List<Integer> data3;
    @Order(10)
    private List<Long> data4;

}
