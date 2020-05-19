package com.example.sw5ecompanion.models.equipment.weapon.martiallightweapons;

public class MartialLightsaber extends MartialLightWeapons {

    public MartialLightsaber() {

        super();
        this.setName("Martial Lightsaber");
        this.setCost(300);
        this.setWeight(2);
        this.setDamage("1d8 energy");
        this.setProperties("hidden", "luminous", "versatile 1d10");
    }
}
