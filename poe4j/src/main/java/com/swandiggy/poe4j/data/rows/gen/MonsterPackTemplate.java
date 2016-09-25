
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterPackTemplates")
public class MonsterPackTemplate
    extends BaseRow
{

    @Order(0)
    private List<Integer> unknown1;
    @Order(1)
    private List<Integer> unknown2;
    @Order(2)
    private Integer unknown3;
    @Order(3)
    private Integer unknown4;
    @Order(4)
    private Integer unknown5;
    @Order(5)
    private Integer unknown6;
    @Order(6)
    private Integer unknown7;
    @Order(7)
    private List<Integer> unknown8;
    @Order(8)
    private Integer unknown9;

}
