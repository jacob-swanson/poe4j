package com.swandiggy.poe4j.base.item.extractor;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swandiggy.poe4j.data.rows.generated.ComponentAttributeRequirement;
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
        this.strength = componentAttributeRequirement.getReqStr();
        this.dexterity = componentAttributeRequirement.getReqDex();
        this.intelligence = componentAttributeRequirement.getReqInt();

        if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 25) {
            this.maxSockets = 6;
            this.type = "Body Armour";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 23) {
            this.maxSockets = 4;
            this.type = "Gloves";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 24) {
            this.maxSockets = 4;
            this.type = "Boots";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 26) {
            this.maxSockets = 4;
            this.type = "Helmet";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 27) {
            this.maxSockets = 4;
            this.type = "Shield";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 18) {
            this.maxSockets = 3;
            this.type = "Two Handed Mace";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 16) {
            this.maxSockets = 6;
            this.type = "Two Handed Sword";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 17) {
            this.maxSockets = 6;
            this.type = "Two Handed Axe";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 15) {
            this.maxSockets = 6;
            this.type = "Staff";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 15) {
            this.maxSockets = 6;
            this.type = "Bow";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 33) {
            this.maxSockets = 6;
            this.type = "Sceptre";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 13) {
            this.maxSockets = 3;
            this.type = "One Handed Mace";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 11) {
            this.maxSockets = 3;
            this.type = "Foil/Rapier";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 10) {
            this.maxSockets = 3;
            this.type = "One Handed Sword";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 12) {
            this.maxSockets = 3;
            this.type = "One Handed Axe";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 7) {
            this.maxSockets = 3;
            this.type = "Claw";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 8) {
            this.maxSockets = 3;
            this.type = "Dagger";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 9) {
            this.maxSockets = 3;
            this.type = "Wand";
        }  else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 14) {
            this.maxSockets = 6;
            this.type = "Bow2";
        } else if (componentAttributeRequirement.getBaseItemType().getItemClass().getIndex() == 38) {
            this.maxSockets = 4;
            this.type = "Fishing Rod";
        } else {
            log.warn("Unknown item class: {}", componentAttributeRequirement);
            this.maxSockets = null;
            this.type = null;
        }
    }
}
