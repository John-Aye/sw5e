package com.example.sw5ecompanion.models.equipment.utilities;

public class Binders extends Utilities {

    private String mDescription;

    public Binders() {

        super();
        this.setName("Binders");
        this.setCost(50);
        this.setWeight(6);
        mDescription = "These durasteel restraints can bind a Small or Medium creature.  Escaping " +
                "the binders requires a successful DC 20 Dexterity check.  Breaking them requires " +
                "a successful DC 20 Strength check.  Each set of binders comes with one key.  " +
                "Without the key, a creature proficient with security kits can pick the binders' " +
                "lock with a successful DC 15 Dexterity check.  Binders have 15 hit points.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
