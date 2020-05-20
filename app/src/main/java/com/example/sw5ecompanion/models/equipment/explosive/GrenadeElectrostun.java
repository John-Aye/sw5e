package com.example.sw5ecompanion.models.equipment.explosive;

public class GrenadeElectrostun extends Explosive {

    public GrenadeElectrostun() {

        super();
        this.setName("Grenade, Electrostun");
        this.setCost(250);
        this.setWeight(1);
        this.setDescription("Electrostun grenades are usually used when the object of a mission " +
                "is to detain, capture, or subdue rather than kill.  Grenades have a range equal " +
                "to 30 feet plus you Strength modifier x 5.  As an action, you can throw a " +
                "grenade at a point you can see within range.  Each creature within 10 feet must " +
                "make a DC 13 Dexterity saving throw.  A creature takes 1d6 lightning damage " +
                "on a failed save, or half as much on a successful one.  Additionally, on a failed " +
                "save the creature is stunned until the end of its next turn.");
    }
}
