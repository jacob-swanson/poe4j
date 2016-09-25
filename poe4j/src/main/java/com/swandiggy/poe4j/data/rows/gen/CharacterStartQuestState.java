
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CharacterStartQuestState")
public class CharacterStartQuestState
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Quest> questKeys;
    @Order(2)
    private List<Integer> questStates;
    @Order(3)
    private List<Long> keys1;
    @Order(4)
    private List<MapPins> mapPinsKeys;
    @Order(5)
    private List<Integer> unknown9;

}
