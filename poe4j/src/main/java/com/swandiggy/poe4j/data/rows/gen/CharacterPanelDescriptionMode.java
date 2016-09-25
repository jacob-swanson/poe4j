
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CharacterPanelDescriptionModes")
public class CharacterPanelDescriptionMode
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String unknown1;
    @Order(2)
    private String formatString_Positive;
    @Order(3)
    private String formatString_Negative;

}
