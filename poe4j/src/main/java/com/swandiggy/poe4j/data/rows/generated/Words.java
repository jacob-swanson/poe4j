
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
public class Words
    extends BaseRow
{

    @Order(0)
    private int Type;
    @Order(1)
    private String Text;
    @Order(2)
    private List<Tags> SpawnWeight_TagsKeys;
    @Order(3)
    private List<Integer> SpawnWeight_Values;
    @Order(4)
    private int Unknown6;
    @Order(5)
    private String Text2;
    @Order(6)
    private String Unknown8;

}
