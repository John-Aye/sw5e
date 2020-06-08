package com.example.sw5ecompanion.models.equipment.armor.shield;

import com.example.sw5ecompanion.models.equipment.armor.Armor;

public class LightPhysicalShield extends Armor {

    public LightPhysicalShield() {

        super();
        this.setName("Light Physical Shield");
        this.setType("Light Armor");
        this.setCost(50);
        this.setWeight(6);
        this.setArmor(1);
        this.setStrength(0);
        this.setStealthPenalty(false);
    }
}
