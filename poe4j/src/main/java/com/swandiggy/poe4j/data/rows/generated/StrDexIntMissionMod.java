
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
@DatFile("StrDexIntMissionMods")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class StrDexIntMissionMod
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Mods> mods;
    @Order(2)
    private int spawnWeight;
    @Order(3)
    private int minLevel;
    @Order(4)
    private int maxLevel;
    @Order(5)
    private Boolean isUniqueMap;

}
