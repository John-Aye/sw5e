package com.example.sw5ecompanion.models.equipment.weapon.simplelightweapons;

import com.example.sw5ecompanion.models.equipment.weapon.martialblaster.MartialBlaster;

public class Lightdagger extends MartialBlaster {

    public Lightdagger() {

        super();
        this.setName("Lightdagger");
        this.setCost(100);
        this.setWeight(1);
        this.setDamage("1d4 energy");
        this.setProperties("finesse", "hidden", "light", "luminous", "thrown 20/60");
    }
}
