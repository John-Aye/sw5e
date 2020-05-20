package com.example.sw5ecompanion.models.equipment.accessories;

public class Jetpack extends Accessories {

    public Jetpack() {

        super();
        this.setName("Jetpack");
        this.setCost(4500);
        this.setWeight(20);
        this.setDescription("Jetpacks are personal aerial transportation devices that allow the " +
                "operator to fly into and through the air with great mobility.  Activating or " +
                "deactivating the jetpack requires a bonus action and, while active, you have a" +
                " fly speed of 30 feet.  The jetpack last for 1 minute per power cell (to a " +
                "maximum of 10 minutes) and can be recharged by a power source or replacing the " +
                "power cells.");
    }
}
