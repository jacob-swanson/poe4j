
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class NPCTextAudio
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private Characters CharactersKey;
    @Order(2)
    private String Text;
    @Order(3)
    private String Mono_AudioFile;
    @Order(4)
    private String Stereo_AudioFile;
    @Order(5)
    private Boolean HasStereo;
    @Order(6)
    private Boolean Flag0;

}
