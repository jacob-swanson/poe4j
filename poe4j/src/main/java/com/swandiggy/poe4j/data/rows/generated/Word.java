
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Words")
public class Word
    extends BaseRow
{

    @Order(0)
    private int type;
    @Order(1)
    private String text;
    @Order(2)
    private List<Tags> spawnWeightTags;
    @Order(3)
    private List<Integer> spawnWeightValues;
    @Order(4)
    private int unknown6;
    @Order(5)
    private String text2;
    @Order(6)
    private String unknown8;

}
