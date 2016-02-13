
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class ExperienceLevels
    extends BaseRow
{

    @Order(0)
    private String Index0;
    @Order(1)
    private int Level;
    @Order(2)
    private Integer Experience;

}
