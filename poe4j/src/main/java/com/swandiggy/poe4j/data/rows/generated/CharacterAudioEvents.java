
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
public class CharacterAudioEvents
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int QuestState;
    @Order(2)
    private int Unknown1;
    @Order(3)
    private int Unknown2;
    @Order(4)
    private List<CharacterTextAudio> Marauder_CharacterTextAudioKeys;
    @Order(5)
    private List<CharacterTextAudio> Ranger_CharacterTextAudioKeys;
    @Order(6)
    private List<CharacterTextAudio> Witch_CharacterTextAudioKeys;
    @Order(7)
    private List<CharacterTextAudio> Duelist_CharacterTextAudioKeys;
    @Order(8)
    private List<CharacterTextAudio> Shadow_CharacterTextAudioKeys;
    @Order(9)
    private List<CharacterTextAudio> Templar_CharacterTextAudioKeys;
    @Order(10)
    private List<CharacterTextAudio> Scion_CharacterTextAudioKeys;
    @Order(11)
    private List<CharacterTextAudio> Goddess_CharacterTextAudioKeys;
    @Order(12)
    private List<CharacterTextAudio> JackTheAxe_CharacterTextAudioKeys;

}
