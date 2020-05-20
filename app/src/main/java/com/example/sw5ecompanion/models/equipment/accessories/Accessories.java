package com.example.sw5ecompanion.models.equipment.accessories;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Accessories extends Equipment {

    private String mDescription;

    public Accessories() {

        super();
        this.setType("Weapon and Armor Accessories");
        this.setQuantity(1);
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
