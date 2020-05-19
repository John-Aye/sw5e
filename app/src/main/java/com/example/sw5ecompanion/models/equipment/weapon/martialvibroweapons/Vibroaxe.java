package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Vibroaxe extends MartialVibroweapons {

    public Vibroaxe() {

        super();
        this.setName("Vibroaxe");
        this.setCost(300);
        this.setWeight(11);
        this.setDamage("1d10 kinetic");
        this.setProperties("dexterity 11", "heavy", "two-handed");
    }
}
