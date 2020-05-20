package com.example.sw5ecompanion.models.equipment.medical;

public class EmergencyBattery extends Medical {

    public EmergencyBattery() {

        super();
        this.setName("Emergency Battery");
        this.setCost(70);
        this.setWeight(5);
        this.setDescription("All non-expendable droids need recharging as they are used.  The " +
                "battery has ten uses.  As an action, you can expend one use of the kit to " +
                "stabilize a droid that has 0 hit points, without needing to make an Intelligence " +
                "(Technology) check.");
        this.setUses(10);
    }
}
