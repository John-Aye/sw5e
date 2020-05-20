package com.example.sw5ecompanion.models.equipment.explosive;

public class GrenadeIon extends Explosive {

    public GrenadeIon() {

        super();
        this.setName("Grenade, Ion");
        this.setCost(250);
        this.setWeight(1);
        this.setDescription("Ion grenades are hand-held explosive devices that releases a blast " +
                "of ion energy.  Grenades have a range equal to 30 feet plus your Strength " +
                "modifier x 5.  As an action, you can throw a grenade at a point you can see " +
                "within range.  Each creature within 10 feet must make a DC 13 Dexterity saving " +
                "throw.  A creature takes 2d4 ion damage on a failed save, or half as much as " +
                "on a successful one.  Any electronics within the blast radius are disabled " +
                "until rebooted.");
    }
}
