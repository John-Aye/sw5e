package com.example.sw5ecompanion.models.equipment.medical;

public class Traumakit extends Medical {

    public Traumakit() {

        super();
        this.setName("Traumakit");
        this.setCost(50);
        this.setWeight(3);
        this.setDescription("A common traumakit can be stocked with bacta packs, and contains " +
                "spray-bandages, bone stabilizers, antiseptics, and other essentials for the " +
                "treatment of wounds.  As an action, you can expend a use of the kit to stabilize " +
                "a creature that has 0 hit points, without needing to make a Wisdom (Medicine) " +
                "check.  A traumakit can be used to stabilize 5 times before it must be restocked " +
                "at its original cost.");
        this.setUses(5);
    }
}
