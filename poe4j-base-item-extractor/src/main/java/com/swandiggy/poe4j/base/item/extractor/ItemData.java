package com.swandiggy.poe4j.base.item.extractor;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swandiggy.poe4j.data.rows.ComponentAttributeRequirement;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Jacob Swanson
 * @since 1/16/2016
 */
@Slf4j
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
    private final Integer maxSockets;
    private final String type;

    public ItemData(ComponentAttributeRequirement componentAttributeRequirement) {
        this.name = componentAttributeRequirement.getBaseItemType().getName();
        this.strength = componentAttributeRequirement.getRequiredStrength();
        this.dexterity = componentAttributeRequirement.getRequiredDexterity();
        this.intelligence = componentAttributeRequirement.getRequiredIntelligence();

        if (componentAttributeRequirement.getBaseItemType().getItemClass() == 25) {
            this.maxSockets = 6;
            this.type = "Body Armour";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 23) {
            this.maxSockets = 4;
            this.type = "Gloves";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 24) {
            this.maxSockets = 4;
            this.type = "Boots";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 26) {
            this.maxSockets = 4;
            this.type = "Helmet";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 27) {
            this.maxSockets = 4;
            this.type = "Shield";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 18) {
            this.maxSockets = 3;
            this.type = "Two Handed Mace";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 16) {
            this.maxSockets = 6;
            this.type = "Two Handed Sword";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 17) {
            this.maxSockets = 6;
            this.type = "Two Handed Axe";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 15) {
            this.maxSockets = 6;
            this.type = "Staff";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 15) {
            this.maxSockets = 6;
            this.type = "Bow";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 33) {
            this.maxSockets = 6;
            this.type = "Sceptre";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 13) {
            this.maxSockets = 3;
            this.type = "One Handed Mace";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 11) {
            this.maxSockets = 3;
            this.type = "Foil/Rapier";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 10) {
            this.maxSockets = 3;
            this.type = "One Handed Sword";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 12) {
            this.maxSockets = 3;
            this.type = "One Handed Axe";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 7) {
            this.maxSockets = 3;
            this.type = "Claw";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 8) {
            this.maxSockets = 3;
            this.type = "Dagger";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 9) {
            this.maxSockets = 3;
            this.type = "Wand";
        }  else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 14) {
            this.maxSockets = 6;
            this.type = "Bow2";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass() == 38) {
            this.maxSockets = 4;
            this.type = "Fishing Rod";
        } else {
            log.warn("Unknown item class: {}", componentAttributeRequirement);
            this.maxSockets = null;
            this.type = null;
        }
    }
}
