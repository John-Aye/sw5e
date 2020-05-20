package com.example.sw5ecompanion.models.equipment.explosive;

public class GrenadeFrag extends Explosive {

    public GrenadeFrag() {

        super();
        this.setName("Grenade, Fragmentation");
        this.setCost(100);
        this.setWeight(1);
        this.setDescription("Frag grenades are cheap, low-damage grenades used mainly by military " +
                "personnel, mercenaries, bounty hunters, and adventurers.  Grenades can be set to " +
                "detonate on impact or set with a timer that lasts several seconds before " +
                "detonating.  Grenades have a range equal to 30 feet plus your Strength modifier " +
                "x 5.  As an action, you can throw a grenade at a point you can see within range.  " +
                "Each creature within 10 feet must make a DC 13 Dexterity saving throw.  A creature " +
                "takes 2d6 kinetic damage on a failed save, or half as much as on a successful one.");
    }
}
