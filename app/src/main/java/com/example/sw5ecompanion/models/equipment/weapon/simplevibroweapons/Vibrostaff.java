package com.example.sw5ecompanion.models.equipment.weapon.simplevibroweapons;

public class Vibrostaff extends SimpleVibroweapons {

    public Vibrostaff() {

        super();
        this.setName("Vibrostaff");
        this.setCost(100);
        this.setWeight(4);
        this.setDamage("1d6 kinetic");
        this.setProperties("versatile 2d4");
    }
}
