package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Vibrowhip extends MartialVibroweapons {

    public Vibrowhip() {

        super();
        this.setName("Vibrowhip");
        this.setCost(150);
        this.setWeight(3);
        this.setDamage("1d4 kinetic");
        this.setProperties("finesse", "whip");
    }
}
