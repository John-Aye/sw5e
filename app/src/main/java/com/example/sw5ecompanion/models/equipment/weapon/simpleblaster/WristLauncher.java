package com.example.sw5ecompanion.models.equipment.weapon.simpleblaster;

public class WristLauncher extends SimpleBlaster {

    public WristLauncher() {

        super();
        this.setName("Wrist Launcher");
        this.setCost(450);
        this.setWeight(1);
        this.setDamage("varies");
        this.setProperties("ammunition", "30/120", "fixed", "reload 1", "special");
    }
}
