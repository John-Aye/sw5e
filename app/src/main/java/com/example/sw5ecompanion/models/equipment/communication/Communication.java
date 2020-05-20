package com.example.sw5ecompanion.models.equipment.communication;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Communication extends Equipment {

    private String mDescription;

    public  Communication() {

        super();
        this.setType("Communications");
        this.setQuantity(1);
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
