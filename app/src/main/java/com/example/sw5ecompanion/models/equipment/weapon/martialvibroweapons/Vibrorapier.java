package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Vibrorapier extends MartialVibroweapons {

    public Vibrorapier() {

        super();
        this.setName("Vibrorapier");
        this.setCost(250);
        this.setWeight(2);
        this.setDamage("1d8 kinetic");
        this.setProperties("finesse");
    }
}
