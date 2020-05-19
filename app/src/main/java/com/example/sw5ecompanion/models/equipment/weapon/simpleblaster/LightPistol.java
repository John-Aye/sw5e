package com.example.sw5ecompanion.models.equipment.weapon.simpleblaster;

public class LightPistol extends SimpleBlaster {

    public LightPistol() {

        super();
        this.setName("Light Pistol");
        this.setCost(350);
        this.setWeight(2);
        this.setDamage("1d4 energy");
        this.setProperties("ammunition", "range 40/160", "light", "reload 12");
    }
}
