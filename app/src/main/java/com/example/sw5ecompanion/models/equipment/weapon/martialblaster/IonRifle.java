package com.example.sw5ecompanion.models.equipment.weapon.martialblaster;

public class IonRifle extends MartialBlaster {

    public IonRifle() {

        super();
        this.setName("Ion Rifle");
        this.setCost(400);
        this.setWeight(3);
        this.setDamage("1d6 ion");
        this.setProperties("ammunition", "range 100/400");
    }
}
