
package com.swandiggy.poe4j.data.rows.generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthSection")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class LabyrinthSection
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Boolean flag0;
    @Order(2)
    private Boolean flag1;
    @Order(3)
    private Boolean flag2;
    @Order(4)
    private Long key0;

}
