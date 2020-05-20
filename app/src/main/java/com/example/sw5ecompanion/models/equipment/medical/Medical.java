package com.example.sw5ecompanion.models.equipment.medical;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Medical extends Equipment {

    private String mDescription;
    private int mUses;

    public Medical() {

        super();
        this.setType("Medical Supplies");
        this.setQuantity(1);
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
