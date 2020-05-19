package com.example.sw5ecompanion.models.equipment.weapon.simpleblaster;

public class BlasterCarbine extends SimpleBlaster {

    public BlasterCarbine() {

        super();
        this.setName("Blaster Carbine");
        this.setCost(300);
        this.setWeight(8);
        this.setDamage("1d6 energy");
        this.setProperties("ammunition", "range 60/240", "reload 16", "two-handed");
    }
}
