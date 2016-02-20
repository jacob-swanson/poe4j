
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CharacterPanelStats")
public class CharacterPanelStat
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String text;
    @Order(2)
    private List<Stats> statsKeys1;
    @Order(3)
    private CharacterPanelDescriptionMode characterPanelDescriptionMode;
    @Order(4)
    private List<Stats> statsKeys2;
    @Order(5)
    private List<Stats> statsKeys3;
    @Order(6)
    private CharacterPanelTab characterPanelTab;
    @Order(7)
    private Boolean flag0;
    @Order(8)
    private List<Integer> data4;

}
