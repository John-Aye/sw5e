package com.example.sw5ecompanion.models.equipment.weapon.simplelightweapons;

public class Lightsaber extends SimpleLightweapons {

    public Lightsaber() {

        super();
        this.setName("Lightsaber");
        this.setCost(500);
        this.setWeight(2);
        this.setDamage("1d6 energy");
        this.setProperties("hidden", "luminous", "versatile 1d8");
    }
}
