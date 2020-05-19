package com.example.sw5ecompanion.models.equipment.weapon.martialblaster;

public class AssaultCannon extends MartialBlaster {

    public AssaultCannon() {

        super();
        this.setName("Assault Cannon");
        this.setCost(500);
        this.setWeight(24);
        this.setDamage("1d10 energy");
        this.setProperties("ammunition", "range 80/320", "burst 4", "reload 8", "strength 11",
                "two-handed");
    }
}
