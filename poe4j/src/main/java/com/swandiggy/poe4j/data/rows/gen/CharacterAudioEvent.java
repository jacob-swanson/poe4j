
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CharacterAudioEvents")
public class CharacterAudioEvent
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer questState;
    @Order(2)
    private Integer unknown1;
    @Order(3)
    private Integer unknown2;
    @Order(4)
    private List<CharacterTextAudio> marauder_CharacterTextAudioKeys;
    @Order(5)
    private List<CharacterTextAudio> ranger_CharacterTextAudioKeys;
    @Order(6)
    private List<CharacterTextAudio> witch_CharacterTextAudioKeys;
    @Order(7)
    private List<CharacterTextAudio> duelist_CharacterTextAudioKeys;
    @Order(8)
    private List<CharacterTextAudio> shadow_CharacterTextAudioKeys;
    @Order(9)
    private List<CharacterTextAudio> templar_CharacterTextAudioKeys;
    @Order(10)
    private List<CharacterTextAudio> scion_CharacterTextAudioKeys;
    @Order(11)
    private List<CharacterTextAudio> goddess_CharacterTextAudioKeys;
    @Order(12)
    private List<CharacterTextAudio> jackTheAxe_CharacterTextAudioKeys;
    @Order(13)
    private Byte flag0;

}
