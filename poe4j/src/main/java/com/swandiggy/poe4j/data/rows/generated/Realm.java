
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Realms")
public class Realm
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private List<String> server;
    @Order(3)
    private Boolean isEnabled;
    @Order(4)
    private List<String> server2;
    @Order(5)
    private String shortName;
    @Order(6)
    private List<Integer> data0;
    @Order(7)
    private int unknown0;
    @Order(8)
    private int unknown1;

}
