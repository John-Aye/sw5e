package com.example.sw5ecompanion.models.equipment.armor.shield;

public class MediumPhysicalShield extends Shield {

    public MediumPhysicalShield() {

        super();
        this.setName("Medium Physical Shield");
        this.setCost(150);
        this.setWeight(18);
        this.setArmor(2);
        this.setStrength(13);
        this.setStealthPenalty(false);
    }
}
