package com.example.sw5ecompanion.models.equipment.weapon.simplevibroweapons;

public class Vibrospear extends SimpleVibroweapons {

    public Vibrospear() {

        super();
        this.setName("Vibrospear");
        this.setCost(120);
        this.setWeight(3);
        this.setDamage("1d6 kinetic");
        this.setProperties("thrown 20/60", "versatile 1d8");
    }
}
