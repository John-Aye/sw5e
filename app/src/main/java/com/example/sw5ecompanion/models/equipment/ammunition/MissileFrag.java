package com.example.sw5ecompanion.models.equipment.ammunition;

public class MissileFrag extends Ammunition {

    public MissileFrag() {

        super();
        this.setName("Missile, Fragmentation");
        this.setCost(100);
        this.setWeight(.5);
        this.setDescription("This wrist launcher ammunition deals 1d6 kinetic damage on a hit." +
                "  Additionally, hit or miss, the missile then explodes.  The target and each " +
                "creature within 5 feet must make a DC 13 Dexterity saving throw, taking 1d6 " +
                "kinetic damage on a failed save or half as much on a successful one.");
        this.setUses(1);
    }
}
