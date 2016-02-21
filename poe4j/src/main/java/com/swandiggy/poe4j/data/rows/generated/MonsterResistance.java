
package com.swandiggy.poe4j.data.rows.generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterResistances")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class MonsterResistance
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private int fireNormal;
    @Order(2)
    private int coldNormal;
    @Order(3)
    private int lightningNormal;
    @Order(4)
    private int chaosNormal;
    @Order(5)
    private int fireCruel;
    @Order(6)
    private int coldCruel;
    @Order(7)
    private int lightningCruel;
    @Order(8)
    private int chaosCruel;
    @Order(9)
    private int fireMerciless;
    @Order(10)
    private int coldMerciless;
    @Order(11)
    private int lightningMerciless;
    @Order(12)
    private int chaosMerciless;

}
