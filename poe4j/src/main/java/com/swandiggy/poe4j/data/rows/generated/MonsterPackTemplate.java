
package com.swandiggy.poe4j.data.rows.generated;

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
    private int unknown3;
    @Order(3)
    private int unknown4;
    @Order(4)
    private int unknown5;
    @Order(5)
    private int unknown6;
    @Order(6)
    private int unknown7;
    @Order(7)
    private List<Integer> unknown8;
    @Order(8)
    private int unknown9;

}
