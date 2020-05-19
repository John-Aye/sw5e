package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Vibroblade extends MartialVibroweapons {

    public Vibroblade() {

        super();
        this.setName("Vibroblade");
        this.setCost(150);
        this.setWeight(2);
        this.setDamage("1d8 kinetic");
        this.setProperties("versatile 1d10");
    }
}
