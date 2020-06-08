package com.example.sw5ecompanion.models.equipment.armor.shield;

import com.example.sw5ecompanion.models.equipment.armor.Armor;

public class HeavyShieldGenerator extends Armor {

    public HeavyShieldGenerator() {

        super();
        this.setName("Heavy Shield Generator");
        this.setType("Heavy Armor");
        this.setCost(1250);
        this.setWeight(12);
        this.setArmor(3);
        this.setStrength(0);
        this.setStealthPenalty(false);
    }
}
