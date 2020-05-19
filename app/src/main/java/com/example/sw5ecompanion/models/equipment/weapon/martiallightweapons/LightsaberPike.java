package com.example.sw5ecompanion.models.equipment.weapon.martiallightweapons;

public class LightsaberPike extends MartialLightWeapons {

    public LightsaberPike() {

        super();
        this.setName("Lightsaber Pike");
        this.setCost(400);
        this.setWeight(6);
        this.setDamage("1d10 energy");
        this.setProperties("dexterity 11", "luminous", "reach", "two-handed");
    }
}
