package com.example.sw5ecompanion.models.equipment.weapon.martialvibroweapons;

public class HiddenBlade extends MartialVibroweapons {

    public HiddenBlade() {

        super();
        this.setName("Hidden Blade");
        this.setCost(200);
        this.setWeight(1);
        this.setDamage("1d4 kinetic");
        this.setProperties("finesse", "fixed", "hidden", "light");
    }
}
