package com.example.sw5ecompanion.models.equipment.accessories;

public class Bipod extends Accessories {

    public Bipod() {

        super();
        this.setName("Bandolier");
        this.setCost(100);
        this.setWeight(2);
        this.setDescription("A bipod is a device mounted to a two-handed blaster weapon to " +
                "offer increased stability while prone.  As an action, you can deploy or collapse " +
                "the bipod.  While deployed, you ignore the Strength requirement on ranged " +
                "weapons with the Strength property while are you prone, and your speed is " +
                "reduced to 0");
    }
}
