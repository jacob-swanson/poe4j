
package com.swandiggy.poe4j.data.rows.generated;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CharacterStartStates")
public class CharacterStartState
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    private Character character;
    @Order(3)
    private int level;
    @Order(4)
    private List<PassiveSkills> passiveSkills;
    @Order(5)
    private Boolean isPVP;
    @Order(6)
    private CharacterStartStateSet characterStartStateSet;
    @Order(7)
    private Long key1;
    @Order(8)
    private List<CharacterStartQuestState> normalCharacterStartQuestState;
    @Order(9)
    private List<CharacterStartQuestState> cruelCharacterStartQuestState;
    @Order(10)
    private List<CharacterStartQuestState> mercilessCharacterStartQuestState;

}
