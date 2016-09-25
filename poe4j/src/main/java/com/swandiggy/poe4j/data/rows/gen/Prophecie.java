
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Prophecies")
public class Prophecie
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String predictionText;
    @Order(2)
    private Integer unknownUnique;
    @Order(3)
    private String name;
    @Order(4)
    private String flavourText;
    @Order(5)
    private List<ClientString> questTracker_ClientStringsKeys;
    @Order(6)
    private String oGGFile;
    @Order(7)
    private ProphecyChain prophecyChainKey;
    @Order(8)
    private Integer prophecyChainPosition;
    @Order(9)
    private Boolean isEnabled;
    @Order(10)
    private Integer sealCost_Normal;
    @Order(11)
    private Integer sealCost_Cruel;
    @Order(12)
    private Integer sealCost_Merciless;
    @Order(13)
    private Boolean flag1;

}
