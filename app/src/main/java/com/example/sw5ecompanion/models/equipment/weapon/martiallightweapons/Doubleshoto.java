package com.example.sw5ecompanion.models.equipment.weapon.martiallightweapons;

public class Doubleshoto extends MartialLightWeapons {

    public Doubleshoto() {

        super();
        this.setName("Doubleshoto");
        this.setCost(1250);
        this.setWeight(4);
        this.setDamage("1d6 energy");
        this.setProperties("double 1d6", "finesse", "light", "luminous", "two-handed");
    }
}
