package com.example.sw5ecompanion.models.equipment.weapon.simplevibroweapons;

public class Vibroknuckler extends SimpleVibroweapons {

    public Vibroknuckler() {

        super();
        this.setName("Vibroknuckler");
        this.setCost(60);
        this.setWeight(2);
        this.setDamage("1d6 kinetic");
        this.setProperties("hidden", "light");
    }
}
