
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class MonsterResistances
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private int FireNormal;
    @Order(2)
    private int ColdNormal;
    @Order(3)
    private int LightningNormal;
    @Order(4)
    private int ChaosNormal;
    @Order(5)
    private int FireCruel;
    @Order(6)
    private int ColdCruel;
    @Order(7)
    private int LightningCruel;
    @Order(8)
    private int ChaosCruel;
    @Order(9)
    private int FireMerciless;
    @Order(10)
    private int ColdMerciless;
    @Order(11)
    private int LightningMerciless;
    @Order(12)
    private int ChaosMerciless;

}
