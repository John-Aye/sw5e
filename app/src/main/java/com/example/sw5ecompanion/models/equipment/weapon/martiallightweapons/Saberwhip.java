package com.example.sw5ecompanion.models.equipment.weapon.martiallightweapons;

public class Saberwhip extends MartialLightWeapons {

    public Saberwhip() {

        super();
        this.setName("Saberwhip");
        this.setCost(300);
        this.setWeight(2);
        this.setDamage("1d4 energy");
        this.setProperties("finesse", "hidden", "luminous", "reach");
    }
}
