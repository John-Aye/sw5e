package com.example.sw5ecompanion.models.equipment.weapon.martialblaster;

public class HeavyPistol extends MartialBlaster {

    public HeavyPistol() {

        super();
        this.setName("Heavy Pistol");
        this.setCost(300);
        this.setWeight(4);
        this.setDamage("1d8 energy");
        this.setProperties("ammunition", "range 40/160", "reload 12", "strength 11");
    }
}
