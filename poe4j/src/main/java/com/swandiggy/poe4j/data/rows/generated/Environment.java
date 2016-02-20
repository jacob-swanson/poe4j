
package com.swandiggy.poe4j.data.rows.generated;

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
    private String baseENVFile;
    @Order(4)
    private String corruptedENVFile;
    @Order(5)
    private List<Long> keys1;
    @Order(6)
    private String corruptedAmbientSoundFile;
    @Order(7)
    private String ambientSoundFile;

}
