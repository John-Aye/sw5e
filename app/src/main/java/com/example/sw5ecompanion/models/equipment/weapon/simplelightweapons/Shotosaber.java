package com.example.sw5ecompanion.models.equipment.weapon.simplelightweapons;

public class Shotosaber extends SimpleLightweapons {

    public Shotosaber() {

        super();
        this.setName("Shotosaber");
        this.setCost(500);
        this.setWeight(2);
        this.setDamage("1d6 energy");
        this.setProperties("finesse", "hidden", "light", "luminous");
    }
}
