
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("PassiveSkills")
public class PassiveSkills
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String icon_DDSFile;
    @Order(2)
    private List<Stats> statsKeys;
    @Order(3)
    private Integer stat1Value;
    @Order(4)
    private Integer stat2Value;
    @Order(5)
    private Integer stat3Value;
    @Order(6)
    private Integer stat4Value;
    @Order(7)
    private Integer passiveSkillGraphId;
    @Order(8)
    private String name;
    @Order(9)
    private List<Characters> charactersKeys;
    @Order(10)
    private Boolean isKeystone;
    @Order(11)
    private Boolean isNotable;
    @Order(12)
    private String flavourText;
    @Order(13)
    private Boolean isJustIcon;
    @Order(14)
    private AchievementItem achievementItemsKey;
    @Order(15)
    private Boolean isJewelSocket;
    @Order(16)
    private BuffDefinitions grantedBuff_BuffDefinitionsKey;
    @Order(17)
    private Long key2;
    @Order(18)
    private Integer buffRelatedUnknown0;
    @Order(19)
    private List<Integer> buffRelatedUnknown1;
    @Order(20)
    private Ascendancy ascendancyKey;
    @Order(21)
    private Boolean isAscendancyStartingNode;
    @Order(22)
    private List<ClientString> reminder_ClientStingsKeys;
    @Order(23)
    private Integer skillPointsGranted;
    @Order(24)
    private Byte isStartingPointUnlock;
    @Order(25)
    private Byte isAscendancy;

}
