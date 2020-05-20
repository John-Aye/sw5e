package com.example.sw5ecompanion.models.equipment.ammunition;

public class CanisterCarbonite extends Ammunition {

    public CanisterCarbonite() {

        super();
        this.setName("Projector Canister, Carbonite");
        this.setCost(150);
        this.setWeight(2);
        this.setDescription("When triggered, this wrist launcher ammunition produces a beam of " +
                "carbonite energy in a line of 15 feet long and 5 feet wide or a 15-foot cone.  A " +
                "single fuel canister holds enough fuel for 3 attacks in a line or a single " +
                "attack in a cone.  Each creature must make a DC 13 Constitution saving throw.  " +
                "On a failed save, a creature takes 1d4 cold damage and has its speed reduced by " +
                "half until the end of your next turn.  On a successful save, a creature takes " +
                "half damage and isn't slowed.  If this damage reduces a creature to 0 hit points, " +
                "that creature is frozen in carbonite for 1 hour.");
        this.setUses(3);
    }
}
