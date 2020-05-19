package com.example.sw5ecompanion.models.equipment.weapon.martialblaster;

public class Slugthrower extends MartialBlaster {

    public Slugthrower() {

        super();
        this.setName("Slugthrower");
        this.setCost(380);
        this.setWeight(14);
        this.setDamage("1d8 kinetic");
        this.setProperties("ammunition", "range 400/400", "burst 6", "reload 12", "two-handed");
    }
}
