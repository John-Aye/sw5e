package com.example.sw5ecompanion.models.equipment.armor.shield;

import com.example.sw5ecompanion.models.equipment.armor.Armor;

public class LightShieldGenerator extends Armor {

    public LightShieldGenerator() {

        super();
        this.setName("Light Shield Generator");
        this.setType("Light Armor");
        this.setCost(125);
        this.setWeight(2);
        this.setArmor(1);
        this.setStrength(0);
        this.setStealthPenalty(false);
    }
}
