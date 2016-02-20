
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.*;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCTextAudio")
public class NPCTextAudio
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Character character;
    @Order(2)
    private String text;
    @Order(3)
    private String monoAudioFile;
    @Order(4)
    private String stereoAudioFile;
    @Order(5)
    private Boolean hasStereo;
    @Order(6)
    private Boolean flag0;

}
