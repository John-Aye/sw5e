package com.example.sw5ecompanion.models.equipment.weapon.simplevibroweapons;

public class Vibrodart extends SimpleVibroweapons {

    public Vibrodart() {

        super();
        this.setName("Vibrodart");
        this.setCost(5);
        this.setWeight(.25);
        this.setDamage("1d4 kinetic");
        this.setProperties("finesse", "special", "thrown 20/60");
    }
}
