
package com.swandiggy.poe4j.data.rows.generated;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile
public class Projectiles
    extends BaseRow
{

    @Order(0)
    private String Id;
    @Order(1)
    private String AOFile;
    @Order(2)
    private String LoopAnimationId;
    @Order(3)
    private String ImpactAnimationId;
    @Order(4)
    private int ProjectileSpeed;
    @Order(5)
    private String Index4;
    @Order(6)
    private Boolean Flag0;
    @Order(7)
    private int Unknown6;
    @Order(8)
    private Boolean Flag1;
    @Order(9)
    private Boolean Flag2;

}
