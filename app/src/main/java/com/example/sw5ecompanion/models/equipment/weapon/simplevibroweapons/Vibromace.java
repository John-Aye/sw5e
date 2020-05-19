package com.example.sw5ecompanion.models.equipment.weapon.simplevibroweapons;

public class Vibromace extends SimpleVibroweapons {

    public Vibromace() {

        super();
        this.setName("Vibromace");
        this.setCost(80);
        this.setWeight(12);
        this.setDamage("1d8 kinetic");
        this.setProperties("heavy", "two-handed");
    }
}
