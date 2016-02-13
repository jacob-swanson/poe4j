
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
public class CharacterStartStates
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Description;
    @Order(2)
    private Characters CharactersKey;
    @Order(3)
    private int Level;
    @Order(4)
    private List<PassiveSkills> PassiveSkillsKeys;
    @Order(5)
    private Boolean IsPVP;
    @Order(6)
    private CharacterStartStateSet CharacterStartStateSetKey;
    @Order(7)
    private Long Key1;
    @Order(8)
    private List<CharacterStartQuestState> Normal_CharacterStartQuestStateKeys;
    @Order(9)
    private List<CharacterStartQuestState> Cruel_CharacterStartQuestStateKeys;
    @Order(10)
    private List<CharacterStartQuestState> Merciless_CharacterStartQuestStateKeys;

}
