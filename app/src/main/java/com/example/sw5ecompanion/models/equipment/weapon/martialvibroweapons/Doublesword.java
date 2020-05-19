package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Doublesword extends MartialVibroweapons {

    public Doublesword() {

        super();
        this.setName("Doublesword");
        this.setCost(700);
        this.setWeight(5);
        this.setDamage("1d8 kinetic");
        this.setProperties("double 1d8", "finesse", "two-handed");
    }
}
