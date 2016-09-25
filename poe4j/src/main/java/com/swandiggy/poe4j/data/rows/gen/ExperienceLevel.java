
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ExperienceLevels")
public class ExperienceLevel
    extends BaseRow
{

    @Order(0)
    private String index0;
    @Order(1)
    private Integer level;
    @Order(2)
    private Integer experience;

}
