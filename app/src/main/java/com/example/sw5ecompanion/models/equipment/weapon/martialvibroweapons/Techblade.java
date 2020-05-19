package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Techblade extends MartialVibroweapons {

    public Techblade() {

        super();
        this.setName("Techblade");
        this.setCost(250);
        this.setWeight(3);
        this.setDamage("1d6 kinetic");
        this.setProperties("finesse", "light");
    }
}
