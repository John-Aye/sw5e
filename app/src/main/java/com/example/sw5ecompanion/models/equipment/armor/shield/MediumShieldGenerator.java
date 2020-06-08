package com.example.sw5ecompanion.models.equipment.armor.shield;

import com.example.sw5ecompanion.models.equipment.armor.Armor;

public class MediumShieldGenerator extends Armor {

    public MediumShieldGenerator() {

        super();
        this.setName("Medium Shield Generator");
        this.setType("Medium Armor");
        this.setCost(375);
        this.setWeight(6);
        this.setArmor(3);
        this.setStrength(0);
        this.setStealthPenalty(false);
    }
}
