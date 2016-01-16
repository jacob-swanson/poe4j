package com.swandiggy.poe4j.data.rows;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jacob Swanson
 * @since 1/15/2016
 */
@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ComponentAttributeRequirements")
public class ComponentAttributeRequirement extends AbstractRow {
    @Order(1)
    @Reference("virtualPath")
    private BaseItemType baseItemType;

    @Order(2)
    private Integer requiredStrength;

    @Order(3)
    private Integer requiredDexterity;

    @Order(4)
    private Integer requiredIntelligence;
}
