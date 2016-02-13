
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
public class StrDexIntMissions
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int SpawnWeight;
    @Order(2)
    private Boolean HasObjectiveBossKill;
    @Order(3)
    private Boolean HasObjectiveFullClear;
    @Order(4)
    private List<Mods> Extra_ModsKeys;
    @Order(5)
    private int Unknown4;
    @Order(6)
    private int Unknown5;
    @Order(7)
    private Boolean HasObjectiveKillExiles;
    @Order(8)
    private Boolean HasObjectiveFindUnique;
    @Order(9)
    private Long Key0;
    @Order(10)
    private Boolean HasObjectiveCompleteMasterMission;
    @Order(11)
    private NPCTalk NPCTalkKey;
    @Order(12)
    private MonsterPacks MonsterPacksKey;
    @Order(13)
    private int ObjectCountRequired;
    @Order(14)
    private int ObjectCountTotal;
    @Order(15)
    private List<Long> Unknown14;

}
