
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrongBoxEffects")
public class StrongBoxEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String normalEPKFile;
    @Order(2)
    private String normalClosed_AOFile;
    @Order(3)
    private String normalOpen_AOFile;
    @Order(4)
    private String magicEPKFile;
    @Order(5)
    private String uniqueEPKFile;
    @Order(6)
    private String rareEPKFile;
    @Order(7)
    private String magicClosedAOFile;
    @Order(8)
    private String uniqueClosedAOFile;
    @Order(9)
    private String rareClosedAOFile;
    @Order(10)
    private String magicOpenAOFile;
    @Order(11)
    private String uniqueOpenAOFile;
    @Order(12)
    private String rareOpenAOFile;

}
