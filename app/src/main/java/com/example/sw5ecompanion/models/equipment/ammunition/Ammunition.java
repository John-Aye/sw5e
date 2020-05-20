package com.example.sw5ecompanion.models.equipment.ammunition;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Ammunition extends Equipment {

    private String mDescription;
    private int uses;

    public Ammunition() {

        super();
        this.setQuantity(1);
        this.setType("Ammunition");
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }
}
