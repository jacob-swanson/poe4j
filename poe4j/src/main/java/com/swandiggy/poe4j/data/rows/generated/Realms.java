
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
public class Realms
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Name;
    @Order(2)
    private List<String> Server;
    @Order(3)
    private Boolean IsEnabled;
    @Order(4)
    private List<String> Server2;
    @Order(5)
    private String ShortName;
    @Order(6)
    private List<Integer> Data0;
    @Order(7)
    private int Unknown0;
    @Order(8)
    private int Unknown1;

}
