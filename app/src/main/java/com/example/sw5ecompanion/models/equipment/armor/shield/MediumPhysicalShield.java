package com.example.sw5ecompanion.models.equipment.armor.shield;

import com.example.sw5ecompanion.models.equipment.armor.Armor;

public class MediumPhysicalShield extends Armor {

    public MediumPhysicalShield() {

        super();
        this.setName("Medium Physical Shield");
        this.setType("Medium Armor");
        this.setCost(150);
        this.setWeight(18);
        this.setArmor(2);
        this.setStrength(13);
        this.setStealthPenalty(false);
    }
}
