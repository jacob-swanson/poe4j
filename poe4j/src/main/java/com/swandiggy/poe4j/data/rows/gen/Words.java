
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Words")
public class Words
    extends BaseRow
{

    @Order(0)
    private Integer type;
    @Order(1)
    private String text;
    @Order(2)
    private List<Tags> spawnWeight_TagsKeys;
    @Order(3)
    private List<Integer> spawnWeight_Values;
    @Order(4)
    private Integer unknown6;
    @Order(5)
    private String text2;
    @Order(6)
    private String unknown8;

}
