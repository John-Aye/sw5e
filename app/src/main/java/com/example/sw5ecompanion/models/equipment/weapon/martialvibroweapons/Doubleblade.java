package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Doubleblade extends MartialVibroweapons {

    public Doubleblade() {

        super();
        this.setName("Doubleblade");
        this.setCost(625);
        this.setWeight(5);
        this.setDamage("1d6 kinetic");
        this.setProperties("double 1d6", "finesse", "light", "two-handed");
    }
}
