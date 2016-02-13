
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
public class StrMissions
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private int MinLevel;
    @Order(3)
    private int MaxLevel;
    @Order(4)
    private NPCTalk NPCTalkKey;
    @Order(5)
    private int f7;
    @Order(6)
    private List<Mods> ModsKeys;
    @Order(7)
    private int f10;
    @Order(8)
    private int f11;
    @Order(9)
    private int f12;
    @Order(10)
    private int f13;
    @Order(11)
    private Boolean b1;
    @Order(12)
    private Boolean b2;

}
