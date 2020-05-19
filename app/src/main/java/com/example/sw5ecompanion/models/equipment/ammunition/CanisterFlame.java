package com.example.sw5ecompanion.models.equipment.ammunition;

public class CanisterFlame extends Ammunition {

    public CanisterFlame() {

        super();
        this.setName("Projector Canister, Flame");
        this.setCost(350);
        this.setWeight(3);
        this.setDescription("When triggered, this wrist launcher ammunition produces a burst " +
                "of flame in a line 15 feet long and 5 feet wide or a 15-foot cone.  A single " +
                "fuel canister holds enough fuel for three attacks in a line or a single attack " +
                "in a cone.  Each creature must make a DC 14 Dexterity saving throw, taking 1d8 " +
                "fire damage on a failure, or half as much on a success.  The fire spreads around " +
                "corners.  It ignites flammable objects in the area that aren't being worn " +
                "or carried.");
        this.setUses(3);
    }
}
