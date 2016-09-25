
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Environments")
public class Environment
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String base_AmbientSoundFile;
    @Order(2)
    private List<Long> keys0;
    @Order(3)
    private String base_ENVFile;
    @Order(4)
    private String corrupted_ENVFile;
    @Order(5)
    private List<Long> keys1;
    @Order(6)
    private String corrupted_AmbientSoundFile;
    @Order(7)
    private String ambientSoundFile;

}
