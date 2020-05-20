package com.example.sw5ecompanion.models.equipment.explosive;

public class GrenadeGas extends Explosive {

    public GrenadeGas() {

        super();
        this.setName("Grenade, Gas");
        this.setCost(300);
        this.setWeight(1);
        this.setDescription("Gas grenades are primarily used to flush enemies out of cover and " +
                "other protected areas, though there are of course other uses.  Grenades have a " +
                "range equal to 30 feet plus your Strength modifier x 5.  As an action, you can " +
                "throw a grenade at a point you can see within range.  The grenade explodes in a " +
                "15-foot-radius sphere of yellow-green fog centered on a point you choose within " +
                "range.  The sphere spreads around corners, and its area is heavily obscured.  It " +
                "lasts for 1 minute or until a wind of at least 10 miles per hour disperses it.\n" +
                "When a creature enters the fog's area for the first time or starts it's turn there" +
                ", that creature must make a DC 13 Constitution saving throw.  The creature takes " +
                "1d8 poison damage on a failed save, or half as much damage on a successful one.  " +
                "Additionally, on a failed save, the creature is poisoned while it is in the cloud." +
                "  Droids, constructs, and humanoids wearing the appropriate protective equipment " +
                "are unaffected.");
    }
}
