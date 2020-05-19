package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Vibrosword extends MartialVibroweapons {

    public Vibrosword() {

        super();
        this.setName("Vibrosword");
        this.setCost(500);
        this.setWeight(6);
        this.setDamage("2d6 kinetic");
        this.setProperties("dexterity 11", "two-handed");
    }
}
