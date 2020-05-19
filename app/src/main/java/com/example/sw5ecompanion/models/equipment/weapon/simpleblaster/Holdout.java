package com.example.sw5ecompanion.models.equipment.weapon.simpleblaster;

public class Holdout extends SimpleBlaster {

    public Holdout() {

        super();
        this.setName("Hold-out");
        this.setCost(250);
        this.setWeight(1);
        this.setDamage("1d4 energy");
        this.setProperties("ammunition", "rang 30/120", "hidden", "light", "reload");
    }
}
