package com.example.sw5ecompanion.models.equipment.tack.barding.medium;

public class CompositeArmor extends Medium {

    public CompositeArmor() {

        super();
        this.setName("Composite Armor");
        this.setCost(10000);
        this.setWeight(90);
        this.setArmor(5);
        this.setStealthPenalty(true);
    }
}
