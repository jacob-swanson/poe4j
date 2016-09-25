
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterResistances")
public class MonsterResistance
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer fireNormal;
    @Order(2)
    private Integer coldNormal;
    @Order(3)
    private Integer lightningNormal;
    @Order(4)
    private Integer chaosNormal;
    @Order(5)
    private Integer fireCruel;
    @Order(6)
    private Integer coldCruel;
    @Order(7)
    private Integer lightningCruel;
    @Order(8)
    private Integer chaosCruel;
    @Order(9)
    private Integer fireMerciless;
    @Order(10)
    private Integer coldMerciless;
    @Order(11)
    private Integer lightningMerciless;
    @Order(12)
    private Integer chaosMerciless;

}
