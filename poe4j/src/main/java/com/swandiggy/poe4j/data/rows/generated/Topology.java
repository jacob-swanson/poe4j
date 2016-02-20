
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Topologies")
public class Topology
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String tGRFile;
    @Order(2)
    private int unknown2;
    @Order(3)
    private int unknown3;
    @Order(4)
    private int unknown4;
    @Order(5)
    private Environment environment;

}
