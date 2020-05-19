package com.example.sw5ecompanion.models.equipment.weapon.simplevibroweapons;

public class Vibrodagger extends SimpleVibroweapons {

    public Vibrodagger() {

        super();
        this.setName("Vibrodagger");
        this.setCost(50);
        this.setWeight(1);
        this.setDamage("1d4 kinetic");
        this.setProperties("finesse", "light", "thrown 20/60");
    }
}
