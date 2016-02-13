
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
public class Environments
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Base_AmbientSoundFile;
    @Order(2)
    private List<Long> Keys0;
    @Order(3)
    private String Base_ENVFile;
    @Order(4)
    private String Corrupted_ENVFile;
    @Order(5)
    private List<Long> Keys1;
    @Order(6)
    private String Corrupted_AmbientSoundFile;
    @Order(7)
    private String AmbientSoundFile;

}
