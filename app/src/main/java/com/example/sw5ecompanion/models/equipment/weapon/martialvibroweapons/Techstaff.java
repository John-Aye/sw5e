package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Techstaff extends MartialVibroweapons {

    public Techstaff() {

        super();
        this.setName("Techstaff");
        this.setCost(600);
        this.setWeight(8);
        this.setDamage("2d4 kinetic");
        this.setProperties("double 2d4", "two-handed");
    }
}
