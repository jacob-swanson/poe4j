
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
public class DaressoPitFights
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Long Key0;
    @Order(2)
    private int Unknown1;
    @Order(3)
    private List<Integer> Unknown2;
    @Order(4)
    private Boolean FlagUnknown0;
    @Order(5)
    private Boolean FlagUnknown2;
    @Order(6)
    private int Unknown3;
    @Order(7)
    private int Unknown4;
    @Order(8)
    private int Unknown6;
    @Order(9)
    private Boolean FlagUnknown3;

}
