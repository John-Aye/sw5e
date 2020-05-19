package com.example.sw5ecompanion.models.equipment.weapon.martialblaster;

public class SniperRifle extends MartialBlaster {

    public SniperRifle() {

        super();
        this.setName("Sniper Rifle");
        this.setCost(750);
        this.setWeight(12);
        this.setDamage("1d12 energy");
        this.setProperties("ammunition", "range 150/600", "reload 2", "strength 11", "two-handed");
    }
}
