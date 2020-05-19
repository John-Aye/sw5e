package com.example.sw5ecompanion.models.equipment.weapon.simplevibroweapons;

public class Techaxe extends SimpleVibroweapons {

    public Techaxe() {

        super();
        this.setName("Techaxe");
        this.setCost(75);
        this.setWeight(2);
        this.setDamage("1d6 kinetic");
        this.setProperties("light", "thrown 20/60");
    }
}
