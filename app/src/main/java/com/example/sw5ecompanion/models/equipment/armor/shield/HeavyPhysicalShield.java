package com.example.sw5ecompanion.models.equipment.armor.shield;

public class HeavyPhysicalShield extends Shield {

    public HeavyPhysicalShield() {

        super();
        this.setName("Heavy Physical Shield");
        this.setCost(500);
        this.setWeight(36);
        this.setArmor(3);
        this.setStrength(15);
        this.setStealthPenalty(true);
    }
}
