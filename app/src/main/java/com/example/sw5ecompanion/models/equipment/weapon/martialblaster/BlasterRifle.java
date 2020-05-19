package com.example.sw5ecompanion.models.equipment.weapon.martialblaster;

public class BlasterRifle extends MartialBlaster {

    public BlasterRifle() {

        super();
        this.setName("Blaster Rifle");
        this.setCost(400);
        this.setWeight(11);
        this.setDamage("1d8 energy");
        this.setProperties("ammunition", "range 100/400", "reload 12", "two-handed");
    }
}
