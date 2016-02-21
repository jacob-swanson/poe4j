
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
@DatFile("DexMissionMods")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class DexMissionMod
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int spawnWeight;
    @Order(2)
    private List<Mods> mod;
    @Order(3)
    private Boolean flag0;
    @Order(4)
    private Boolean flag1;
    @Order(5)
    private int minLevel;
    @Order(6)
    private int maxLevel;
    @Order(7)
    private Boolean flag2;

}
