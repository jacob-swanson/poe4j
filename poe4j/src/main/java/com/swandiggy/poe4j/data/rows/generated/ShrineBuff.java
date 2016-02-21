
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
@DatFile("ShrineBuffs")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ShrineBuff
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Integer> buffStatValue;
    @Order(2)
    private BuffDefinition buffDefinition;
    @Order(3)
    private Long key0;

}
