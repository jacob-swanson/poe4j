
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class QuestStates
    extends BaseRow
{

    @Order(0)
    private Quest QuestKey;
    @Order(1)
    private int Unknown2;
    @Order(2)
    private List<Integer> QuestStates;
    @Order(3)
    private List<Integer> Data1;
    @Order(4)
    private String Text;
    @Order(5)
    private Boolean Flag0;
    @Order(6)
    private String Message;
    @Order(7)
    private List<Long> Data2;
    @Order(8)
    private int Unknown9;
    @Order(9)
    private List<Integer> Data3;
    @Order(10)
    private List<Long> Data4;

}
