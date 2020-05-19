package com.example.sw5ecompanion.models.equipment.weapon.martiallightweapons;

public class Doublesaber extends MartialLightWeapons {

    public Doublesaber() {

        super();
        this.setName("Doublesaber");
        this.setCost(1400);
        this.setWeight(4);
        this.setDamage("1d8 energy");
        this.setProperties("double 1d8", "finesse", "luminous", "two-handed");
    }
}
