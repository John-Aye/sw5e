package com.example.sw5ecompanion.models.equipment.weapon.simpleblaster;

public class Shotgun extends SimpleBlaster {

    public Shotgun() {

        super();
        this.setName("Shotgun");
        this.setCost(350);
        this.setWeight(12);
        this.setDamage("2d4 kinetic");
        this.setProperties("ammunition", "range 30/120", "burst 2", "reload 4", "strength 11",
                "two-handed");
    }
}
