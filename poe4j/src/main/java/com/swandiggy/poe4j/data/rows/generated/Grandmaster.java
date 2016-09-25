
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Grandmasters")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Grandmaster
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String gmFile;
    @Order(2)
    private String AisFile;
    @Order(3)
    private List<Mods> mods;
    @Order(4)
    private Integer characterLevel;
    @Order(5)
    private Boolean flag0;

}
