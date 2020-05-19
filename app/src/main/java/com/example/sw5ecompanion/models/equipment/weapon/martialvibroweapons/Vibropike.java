package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Vibropike extends MartialVibroweapons {

    public Vibropike() {

        super();
        this.setName("Vibropike");
        this.setCost(200);
        this.setWeight(2);
        this.setDamage("1d10 kinetic");
        this.setProperties("dexterity 11", "reach", "two-handed");
    }
}
