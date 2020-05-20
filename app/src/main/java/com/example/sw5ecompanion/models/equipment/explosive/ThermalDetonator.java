package com.example.sw5ecompanion.models.equipment.explosive;

public class ThermalDetonator extends Explosive {

    public ThermalDetonator() {

        super();
        this.setName("Thermal Detonator");
        this.setCost(750);
        this.setWeight(1);
        this.setDescription("Thermal detonators are palm-sized, spherical, and extremely deadly " +
                "explosive weapons.  In addition to being surprisingly powerful for their size, " +
                "they can only be turned off by whoever turned them on.  Thermal detonators have a " +
                "range of 30 feet plus your Strength modifier x 5. As an action, you can throw a " +
                "grenade at a point you can see within range.  Each creature within 10 feet must " +
                "make a DC13 Dexterity saving throw.  A creature takes 2d6 fire damage and 2d6 " +
                "kinetic damage on a failed save, or half as much as on a successful one.  " +
                "Additionally, on a failed save, the creature is knocked prone.");
    }
}
