package com.example.sw5ecompanion.models.equipment.accessories;

public class Tripod extends Accessories {

    public Tripod() {

        super();
        this.setName("Tripod");
        this.setCost(450);
        this.setWeight(16);
        this.setDescription("A tripod is a device used to mount a two-handed blaster weapon to " +
                "offer increased stability.  Over the course of 1 minute, you can deploy or " +
                "collapse the tripod.  While deployed, you ignore the strength requirement on " +
                "ranged weapons with the strength property, and your speed is reduced to 0.");
    }
}
