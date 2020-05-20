package com.example.sw5ecompanion.models.equipment.explosive;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Explosive extends Equipment {

    private String mDescription;
    private int mUses;

    public Explosive() {

        super();
        this.setType("Explosive");
        this.setQuantity(1);
        mUses = 1;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getUses() {
        return mUses;
    }

    public void setUses(int uses) {
        mUses = uses;
    }
}
