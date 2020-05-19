package com.example.sw5ecompanion.models.equipment.weapon.martiallightweapons;

public class Greatsaber extends MartialLightWeapons {

    public Greatsaber() {

        super();
        this.setName("Bowcaster");
        this.setCost(400);
        this.setWeight(16);
        this.setDamage("2d6 energy");
        this.setProperties("dexterity 11", "luminous", "two-handed");
    }
}
