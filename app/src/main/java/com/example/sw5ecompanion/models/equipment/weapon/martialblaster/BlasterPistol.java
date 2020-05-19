package com.example.sw5ecompanion.models.equipment.weapon.martialblaster;

public class BlasterPistol extends MartialBlaster {

    public BlasterPistol() {

        super();
        this.setName("Blaster Pistol");
        this.setCost(200);
        this.setWeight(3);
        this.setDamage("1d6 energy");
        this.setProperties("ammunition", "range 40/160", "reload 16");
    }
}
