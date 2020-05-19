package com.example.sw5ecompanion.models.equipment.weapon.simpleblaster;

public class Scattergun extends SimpleBlaster {

    public Scattergun() {

        super();
        this.setName("Scattergun");
        this.setCost(200);
        this.setWeight(3);
        this.setDamage("1d6 kinetic");
        this.setProperties("ammunition", "range 20/80", "burst4", "reload 4");
    }
}
