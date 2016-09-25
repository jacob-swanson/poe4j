
package com.swandiggy.poe4j.data.rows.gen;

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
    private Quest questKey;
    @Order(1)
    private Integer unknown0;
    @Order(2)
    private List<Integer> questStates;
    @Order(3)
    private List<Integer> data1;
    @Order(4)
    private String text;
    @Order(5)
    private Boolean flag0;
    @Order(6)
    private String message;
    @Order(7)
    private List<MapPins> mapPinsKeys1;
    @Order(8)
    private Integer unknown1;
    @Order(9)
    private List<String> mapPinsTexts;
    @Order(10)
    private List<MapPins> mapPinsKeys2;
    @Order(11)
    private List<Long> keys2;
    @Order(12)
    private String questFinished_OGGFile;
    @Order(13)
    private Boolean unknown2;
    @Order(14)
    private List<Integer> unknown3;

}
