
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
public class CharacterPanelStats
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Text;
    @Order(2)
    private List<Stats> StatsKeys1;
    @Order(3)
    private CharacterPanelDescriptionModes CharacterPanelDescriptionModesKey;
    @Order(4)
    private List<Stats> StatsKeys2;
    @Order(5)
    private List<Stats> StatsKeys3;
    @Order(6)
    private CharacterPanelTabs CharacterPanelTabsKey;
    @Order(7)
    private Boolean Flag0;
    @Order(8)
    private List<Integer> Data4;

}
