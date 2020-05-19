package com.example.sw5ecompanion.models.equipment.weapon.martialblaster;

public class IonPistol extends MartialBlaster {

    public IonPistol() {

        super();
        this.setName("Ion Pistol");
        this.setCost(200);
        this.setWeight(3);
        this.setDamage("1d4 ion");
        this.setProperties("ammunition", "range 40/160", "reload 16");
    }
}
