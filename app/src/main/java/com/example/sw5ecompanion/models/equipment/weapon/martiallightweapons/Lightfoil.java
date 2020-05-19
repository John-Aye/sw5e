package com.example.sw5ecompanion.models.equipment.weapon.martiallightweapons;

public class Lightfoil extends MartialLightWeapons {

    public Lightfoil() {

        super();
        this.setName("Lightfoil");
        this.setCost(500);
        this.setWeight(2);
        this.setDamage("1d8 energy");
        this.setProperties("finesse", "hidden", "luminous");
    }
}
