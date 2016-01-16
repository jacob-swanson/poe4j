package com.swandiggy.poe4j.vorici.calc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swandiggy.poe4j.data.rows.ComponentAttributeRequirement;
import lombok.Data;

/**
 * @author Jacob Swanson
 * @since 1/16/2016
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemData {
    private final String name;
    @JsonProperty("str")
    private final Integer strength;
    @JsonProperty("dex")
    private final Integer dexterity;
    @JsonProperty("int")
    private final Integer intelligence;
    private final Integer numSockets;

    public ItemData(ComponentAttributeRequirement componentAttributeRequirement) {
        this.name = componentAttributeRequirement.getBaseItemType().getName();
        this.strength = componentAttributeRequirement.getRequiredStrength();
        this.dexterity = componentAttributeRequirement.getRequiredDexterity();
        this.intelligence = componentAttributeRequirement.getRequiredIntelligence();

        if (componentAttributeRequirement.getBaseItemType().getItemClass() == 25) {
            this.numSockets = 6;
        } else {
            this.numSockets = null;
        }
    }
}
