
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCAudio")
public class NPCAudio
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Integer> unknown1;
    @Order(2)
    private List<Integer> unknown2;

}
