package com.example.sw5ecompanion.models.equipment.weapon.simpleblaster;

public class Bowcaster extends SimpleBlaster {

    public Bowcaster() {

        super();
        this.setName("Bowcaster");
        this.setCost(400);
        this.setWeight(16);
        this.setDamage("1d10 energy");
        this.setProperties("ammunition", "range 50/200", "burst 4", "reload 4",
                "strength 11", "two-handed");
    }
}
