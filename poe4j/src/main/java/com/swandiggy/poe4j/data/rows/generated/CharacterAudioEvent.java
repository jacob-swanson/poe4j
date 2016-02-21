
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CharacterAudioEvents")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CharacterAudioEvent
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int questState;
    @Order(2)
    private int unknown1;
    @Order(3)
    private int unknown2;
    @Order(4)
    private List<CharacterTextAudio> marauderCharacterTextAudio;
    @Order(5)
    private List<CharacterTextAudio> rangerCharacterTextAudio;
    @Order(6)
    private List<CharacterTextAudio> witchCharacterTextAudio;
    @Order(7)
    private List<CharacterTextAudio> duelistCharacterTextAudio;
    @Order(8)
    private List<CharacterTextAudio> shadowCharacterTextAudio;
    @Order(9)
    private List<CharacterTextAudio> templarCharacterTextAudio;
    @Order(10)
    private List<CharacterTextAudio> scionCharacterTextAudio;
    @Order(11)
    private List<CharacterTextAudio> goddessCharacterTextAudio;
    @Order(12)
    private List<CharacterTextAudio> jackTheAxeCharacterTextAudio;

}
