
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
@DatFile("Projectiles")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Projectile
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String aOFile;
    @Order(2)
    private String loopAnimationId;
    @Order(3)
    private String impactAnimationId;
    @Order(4)
    private int projectileSpeed;
    @Order(5)
    private String index4;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private int unknown6;
    @Order(8)
    private Boolean flag1;
    @Order(9)
    private Boolean flag2;

}
