package com.example.sw5ecompanion.models.equipment.lifesupport;

public class AquaticBreather extends LifeSupport {

    public AquaticBreather() {

        super();
        this.setName("Aquatic Breather");
        this.setCost(100);
        this.setWeight(2);
        this.setDescription("Aquatic breathers are breath masks designed to operate underwater.  " +
                "While worn, the wearer can breathe air and water.");
    }
}
