package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Chakram extends MartialVibroweapons {

    public Chakram() {

        super();
        this.setName("Chakram");
        this.setCost(75);
        this.setWeight(2);
        this.setDamage("1d6 kinetic");
        this.setProperties("finesse", "returning", "thrown 30/90");
    }
}
