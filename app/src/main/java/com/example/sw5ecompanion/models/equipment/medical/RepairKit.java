package com.example.sw5ecompanion.models.equipment.medical;

public class RepairKit extends Medical {

    public RepairKit() {

        super();
        this.setName("Repair Kit");
        this.setCost(750);
        this.setWeight(3);
        this.setDescription("A repair kit included the basic tools needed to repair a droid " +
                "after being damaged in combat.  The kit has 3 uses.  As an action, you can expend " +
                "one use of the kit to restore 2d4 +2 hit points to a droid or construct within " +
                "5 feet");
        this.setUses(3);
    }
}
