
package com.swandiggy.poe4j.data.rows.generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.*;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Ascendancy")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Ascendancy
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int classNo;
    @Order(2)
    private Character character;
    /**
     * Coordinates in x1,y1,x2,y2 format
     */
    @Order(3)
    private String coordinateRect;
    @Order(4)
    private String rgbFlavourTextColour;
    @Order(5)
    private String name;
    @Order(6)
    private String flavourText;
    @Order(7)
    private String oggFile;

}
