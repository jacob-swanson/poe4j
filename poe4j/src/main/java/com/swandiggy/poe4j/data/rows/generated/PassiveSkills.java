
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
public class PassiveSkills
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String Icon;
    @Order(2)
    private List<Stats> StatsKeys;
    @Order(3)
    private int Stat1Value;
    @Order(4)
    private int Stat2Value;
    @Order(5)
    private int Stat3Value;
    @Order(6)
    private int Stat4Value;
    @Order(7)
    private int PassiveSkillGraphId;
    @Order(8)
    private String Name;
    @Order(9)
    private List<Characters> CharactersKeys;
    @Order(10)
    private Boolean IsKeystone;
    @Order(11)
    private Boolean IsNotable;
    @Order(12)
    private String FlavourText;
    @Order(13)
    private Boolean IsJustIcon;
    @Order(14)
    private Long Key0;
    @Order(15)
    private Boolean IsJewelSocket;
    @Order(16)
    private Long Key1;
    @Order(17)
    private Long Key2;
    @Order(18)
    private int Unknown5;
    @Order(19)
    private List<Integer> Unknown6;
    @Order(20)
    private Long Key3;
    @Order(21)
    private Byte Unknown10;

}
