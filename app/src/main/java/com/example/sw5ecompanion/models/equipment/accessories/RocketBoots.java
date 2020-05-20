package com.example.sw5ecompanion.models.equipment.accessories;

public class RocketBoots extends Accessories {

    public RocketBoots() {

        super();
        this.setName("Rocket Boots");
        this.setCost(2500);
        this.setWeight(3);
        this.setDescription("Rocket boots are a form of rocket propulsion system affixed to a " +
                "pair of boots instead of being worn on the back like a standard jetpack.  " +
                "Activating or deactivating the boots requires a bonus action, and while active," +
                "you have a flying speed of 20 feet.  The rocket boots last for 1 minute and can " +
                "be recharged by a power source or replacing the power cell.");
    }
}
