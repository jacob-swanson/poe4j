
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrMissions")
public class StrMission
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private Integer minLevel;
    @Order(3)
    private Integer maxLevel;
    @Order(4)
    private NPCTalk nPCTalkKey;
    @Order(5)
    private Integer f7;
    @Order(6)
    private List<Mods> modsKeys;
    @Order(7)
    private Integer f10;
    @Order(8)
    private Integer f11;
    @Order(9)
    private Integer f12;
    @Order(10)
    private Integer f13;
    @Order(11)
    private Boolean b1;
    @Order(12)
    private Boolean b2;

}
