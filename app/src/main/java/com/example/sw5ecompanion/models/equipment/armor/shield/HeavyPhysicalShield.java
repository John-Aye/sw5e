package com.example.sw5ecompanion.models.equipment.armor.shield;

import com.example.sw5ecompanion.models.equipment.armor.Armor;

public class HeavyPhysicalShield extends Armor {

    public HeavyPhysicalShield() {

        super();
        this.setName("Heavy Physical Shield");
        this.setType("Heavy Armor");
        this.setCost(500);
        this.setWeight(36);
        this.setArmor(3);
        this.setStrength(15);
        this.setStealthPenalty(true);
    }
}
