
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Ascendancy")
public class Ascendancy
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer classNo;
    @Order(2)
    private Characters charactersKey;
    @Order(3)
    private String coordinateRect;
    @Order(4)
    private String rGBFlavourTextColour;
    @Order(5)
    private String name;
    @Order(6)
    private String flavourText;
    @Order(7)
    private String oGGFile;

}
