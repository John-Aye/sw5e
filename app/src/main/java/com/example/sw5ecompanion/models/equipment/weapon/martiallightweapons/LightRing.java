package com.example.sw5ecompanion.models.equipment.weapon.martiallightweapons;

public class LightRing extends MartialLightWeapons {

    public LightRing() {

        super();
        this.setName("Light Ring");
        this.setCost(500);
        this.setWeight(3);
        this.setDamage("1d6 energy");
        this.setProperties("finesse", "hidden", "luminous", "returning", "thrown 30/90");
    }
}
