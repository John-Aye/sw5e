package com.example.sw5ecompanion.models.equipment.lifesupport;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class LifeSupport extends Equipment {

    private String mDescription;

    public LifeSupport() {

        super();
        this.setType("Life Support");
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
