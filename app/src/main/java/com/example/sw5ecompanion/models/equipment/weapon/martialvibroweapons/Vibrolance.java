package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class Vibrolance extends MartialVibroweapons {

    public Vibrolance() {

        super();
        this.setName("Vibrolance");
        this.setCost(100);
        this.setWeight(6);
        this.setDamage("1d12 kinetic");
        this.setProperties("reach", "special");
    }
}
