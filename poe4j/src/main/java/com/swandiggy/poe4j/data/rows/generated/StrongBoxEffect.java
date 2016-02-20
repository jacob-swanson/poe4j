
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
    private String normalEpkFile;
    @Order(2)
    private String normalClosedAoFile;
    @Order(3)
    private String normalOpenAoFile;
    @Order(4)
    private String magicEpkFile;
    @Order(5)
    private String uniqueEpkFile;
    @Order(6)
    private String rareEpkFile;
    @Order(7)
    private String magicClosedAoFile;
    @Order(8)
    private String uniqueClosedAoFile;
    @Order(9)
    private String rareClosedAoFile;
    @Order(10)
    private String magicOpenAoFile;
    @Order(11)
    private String uniqueOpenAoFile;
    @Order(12)
    private String rareOpenAoFile;

}
